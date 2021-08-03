import {Component, OnInit} from '@angular/core';
import {Customer} from '../../../models/customer/Customer';
import {CustomerService} from '../../../service/customer/customer.service';
import {MatDialog} from '@angular/material/dialog';
import {CustomerDeleteComponent} from '../customer-delete/customer-delete.component';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListComponent implements OnInit {

  customers: Customer[] = [];
  dateStart: any;
  dateEnd1: any;
  searchText: any = '';
  config: any;
  key = 'id';
  reverse = false;

  constructor(private customerService: CustomerService,
              private dialog: MatDialog) {
    this.paging();
  }


  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.customerService.getAll().subscribe(customers => {
      this.customers = customers;
    });
  }

  openDialogDelete(id: string, name: string) {
    const dialogRef = this.dialog.open(CustomerDeleteComponent, {
      data: {id, name}
    });
    dialogRef.afterClosed().subscribe(() => {
      this.ngOnInit();
    });
  }

  paging() {
    this.config = {
      itemsPerPage: 3,
      currentPage: 1,
      totalItems: this.customers.length
    };
  }

  search() {
    this.customerService.search(this.searchText, this.dateStart, this.dateEnd1).subscribe(customers => {
      this.customers = customers;
      this.paging();
    });
  }

  pageChanged(event: number) {
    this.config.currentPage = event;
  }

  sort(key) {
    this.key = key;
    this.reverse = !this.reverse;
  }
}
