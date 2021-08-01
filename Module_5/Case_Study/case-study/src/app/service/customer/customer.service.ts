import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../../models/customer/Customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public API_URL = 'http://localhost:3000/customer';

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<Customer[]> {
    return this.http.get<Customer[]>(this.API_URL);
  }

  saveCustomer(customer): Observable<Customer> {
    return this.http.post<Customer>(this.API_URL, customer);
  }

  findById(id: string): Observable<Customer> {
    return this.http.get<Customer>(`${this.API_URL}/${id}`);
  }

  updateCustomer(id: string, customer: Customer): Observable<Customer> {
    return this.http.put<Customer>(`${this.API_URL}/${id}`, customer);
  }

  deleteCustomer(id: string): Observable<Customer> {
    return this.http.delete<Customer>(`${this.API_URL}/${id}`);
  }

  search(searchText, dateStart, dateEnd): Observable<any> {
    if (dateStart === undefined) {
      dateStart = '0000-00-00';
    }
    if (dateEnd === undefined) {
      dateEnd = '9999-12-12';
    }
    return this.http.get(this.API_URL + '?dateOfBirth_gte=' + dateStart + '&dateOfBirth_lte=' + dateEnd + '&name_like=' + searchText);
  }
}
