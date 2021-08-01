import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerType} from '../../../models/customer/CustomerType';
import {CustomerService} from '../../../service/customer/customer.service';
import {CustomerTypeService} from '../../../service/customer/customer-type.service';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {Customer} from '../../../models/customer/Customer';

@Component({
  selector: 'app-customer-view',
  templateUrl: './customer-view.component.html',
  styleUrls: ['./customer-view.component.scss']
})
export class CustomerViewComponent implements OnInit {
  customerForm: FormGroup;
  id: string;
  customerType: CustomerType[] = [];
  customers: Customer;

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      this.getCustomer(this.id);
    });
  }

  ngOnInit(): void {
    // @ts-ignore
    this.getCustomer();
    this.getAllCustomerType();
  }

  getCustomer(id: string) {
    return this.customerService.findById(id).subscribe(customer => {
      this.customers = customer;
    });
  }

  getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(customerType => {
      this.customerType = customerType;
    });
  }

  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

}
