import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerAddComponent } from './components/customer/customer-add/customer-add.component';
import { CustomerListComponent } from './components/customer/customer-list/customer-list.component';
import { CustomerEditComponent } from './components/customer/customer-edit/customer-edit.component';
import { EmployeeAddComponent } from './components/employee/employee-add/employee-add.component';
import { EmployeeListComponent } from './components/employee/employee-list/employee-list.component';
import { EmployeeEditComponent } from './components/employee/employee-edit/employee-edit.component';
import { LayoutHeaderComponent } from './components/layout/layout-header/layout-header.component';
import { LayoutFooterComponent } from './components/layout/layout-footer/layout-footer.component';
import { IndexPageComponent } from './components/home/index-page/index-page.component';
import {Routes, RouterModule} from '@angular/router';
import { LayoutContentComponent } from './components/layout/layout-content/layout-content.component';
const routesConfig: Routes = [
  {path: 'employee-add', component: EmployeeAddComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-edit', component: EmployeeEditComponent},
  {path: 'footer', component: LayoutFooterComponent},
  {path: 'header', component: LayoutHeaderComponent},
  {path: 'index', component: IndexPageComponent},
  {path: 'content', component: LayoutContentComponent},
  {path: 'customer-add', component: CustomerAddComponent},
  {path: 'customer-list', component: CustomerListComponent},
  {path: 'customer-edit', component: CustomerEditComponent},
  {path: '', redirectTo: '/content', pathMatch: 'full'},
];
@NgModule({
  declarations: [
    AppComponent,
    CustomerAddComponent,
    CustomerListComponent,
    CustomerEditComponent,
    EmployeeAddComponent,
    EmployeeListComponent,
    EmployeeEditComponent,
    LayoutHeaderComponent,
    LayoutFooterComponent,
    IndexPageComponent,
    LayoutContentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routesConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
