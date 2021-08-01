import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerType} from '../../../models/customer/CustomerType';
import {CustomerService} from '../../../service/customer/customer.service';
import {CustomerTypeService} from '../../../service/customer/customer-type.service';
import {ActivatedRoute, ParamMap} from '@angular/router';

@Component({
  selector: 'app-customer-edit',
  templateUrl: './customer-edit.component.html',
  styleUrls: ['./customer-edit.component.scss']
})
export class CustomerEditComponent implements OnInit {
  customerForm: FormGroup;
  id: string;
  customerType: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      this.id = paramMap.get('id');
      this.getCustomer(this.id);
    });
  }

  ngOnInit(): void {
    this.getAllCustomerType();
  }

  getCustomer(id: string) {
    return this.customerService.findById(id).subscribe(customer => {
      this.customerForm = new FormGroup({
        name: new FormControl(customer.name),
        dateOfBirth: new FormControl(customer.dateOfBirth),
        idCard: new FormControl(customer.idCard),
        phone: new FormControl(customer.phone),
        email: new FormControl(customer.email),
        address: new FormControl(customer.address),
        customerType: new FormControl(customer.customerType),
      });
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


  editCustomer(id: string) {
    const customer = this.customerForm.value;
    customer.customerType = {
      id: customer.customerType.id,
      name: customer.customerType.name
    };
    this.customerService.updateCustomer(id, customer).subscribe(() =>
      alert('Update Thành công! '));
  }
}
