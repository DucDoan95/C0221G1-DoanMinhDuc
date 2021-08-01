import {Component, Inject, OnInit} from '@angular/core';
import {CustomerService} from '../../../service/customer/customer.service';
import {MAT_DIALOG_DATA} from '@angular/material/dialog';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.scss']
})
export class CustomerDeleteComponent implements OnInit {

  constructor(private customerService: CustomerService, @Inject(MAT_DIALOG_DATA) public data) {
  }

  delete(id: any) {
    this.customerService.deleteCustomer(id).subscribe();
  }

  ngOnInit(): void {
  }

}
