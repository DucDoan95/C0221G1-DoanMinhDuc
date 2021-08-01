import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {LayoutContentComponent} from './components/layout/layout-content/layout-content.component';
import {CustomerEditComponent} from './components/customer/customer-edit/customer-edit.component';
import {CustomerAddComponent} from './components/customer/customer-add/customer-add.component';
import {CustomerViewComponent} from './components/customer/customer-view/customer-view.component';


const routes: Routes = [
  {
    path: 'customer/list',
    component: CustomerListComponent
  },
  {
    path: 'customer/create',
    component: CustomerAddComponent
  },
  {
    path: 'customer/edit/:id',
    component: CustomerEditComponent
  },
  {
    path: 'customer/view/:id',
    component: CustomerViewComponent
  },
  {
    path: '',
    component: LayoutContentComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
