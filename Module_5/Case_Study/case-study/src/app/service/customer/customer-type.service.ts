import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {CustomerType} from '../../models/customer/CustomerType';

@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  public API_URL = 'http://localhost:3000/customerType';

  constructor(private http: HttpClient) {
  }

  getAll(): Observable<CustomerType[]> {
    return this.http.get<CustomerType[]>(this.API_URL);
  }

  findById(id: number): Observable<CustomerType> {
    return this.http.get<CustomerType>(`${this.API_URL}/${id}`);
  }
}
