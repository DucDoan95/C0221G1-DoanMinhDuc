import {Component, OnInit} from '@angular/core';
import {Customer} from '../../../models/customer/Customer';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.scss']
})
export class CustomerListComponent implements OnInit {
  customer: Customer;
  customerList: Customer[] = [
    {
      id: 'KH-0001',
      name: 'Đức Đoàn 1',
      dateOfBirth: '2020-02-02',
      idCard: '1000000',
      phone: '09090909',
      email: 'abc@gmail.com',
      address: '123abc'
    },
    {
      id: 'KH-0002',
      name: 'Đức Đoàn 2',
      dateOfBirth: '2020-02-02',
      idCard: '1000000',
      phone: '09090909',
      email: 'abc@gmail.com',
      address: '123abc'
    },
    {
      id: 'KH-0003',
      name: 'Đức Đoàn 3',
      dateOfBirth: '2020-02-02',
      idCard: '1000000',
      phone: '09090909',
      email: 'abc@gmail.com',
      address: '123abc'
    },
    {
      id: 'KH-0004',
      name: 'Đức Đoàn',
      dateOfBirth: '2020-02-02',
      idCard: '1000000',
      phone: '09090909',
      email: 'abc@gmail.com',
      address: '123abc'
    },
    {
      id: 'KH-0005',
      name: 'Đức Đoàn 4',
      dateOfBirth: '2020-02-02',
      idCard: '1000000',
      phone: '09090909',
      email: 'abc@gmail.com',
      address: '123abc'
    },
    {
      id: 'KH-0006',
      name: 'Đức Đoàn 4',
      dateOfBirth: '2020-02-02',
      idCard: '1000000',
      phone: '09090909',
      email: 'abc@gmail.com',
      address: '123abc'
    }
  ];

  constructor() {
  }

  ngOnInit(): void {
  }

}
