import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {CustomerType} from '../../../models/customer/CustomerType';
import {Customer} from '../../../models/customer/Customer';
import {CustomerService} from '../../../service/customer/customer.service';
import {CustomerTypeService} from '../../../service/customer/customer-type.service';

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.scss']
})
export class CustomerAddComponent implements OnInit {
  customerTypes: CustomerType [] = [];
  customerType: CustomerType = {id: 3, name: 'Gold'};
  customerForm = new FormGroup({
    id: new FormControl('', [Validators.required, Validators.pattern(/^KH-[0-9]{4}$/)]),
    name: new FormControl('', [Validators.required]),
    dateOfBirth: new FormControl('', [Validators.required]),
    idCard: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]{9}/)]),
    phone: new FormControl('', [Validators.required, Validators.pattern(/^\+84[0-9]{9,10}/)]),
    email: new FormControl('', [Validators.required, Validators.email]),
    address: new FormControl('', [Validators.required]),
    customerType: new FormControl(this.customerType, [Validators.required]),
  });

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService) {
  }

  ngOnInit(): void {
    this.getAllCustomerType();

  }

  createCustomer() {
    const customer = this.customerForm.value;
    if (this.customerForm.valid) {
      this.customerService.saveCustomer(customer).subscribe(() => {
        alert('Thêm customer thành công');
        this.customerForm.reset();
      });
    } else {
      alert('Thêm customer thất bại');

    }
  }

  getAllCustomerType() {
    this.customerTypeService.getAll().subscribe(customerType => {
      this.customerTypes = customerType;
    });
  }
  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

}
