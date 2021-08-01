import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {LayoutHeaderComponent} from './components/layout/layout-header/layout-header.component';
import {LayoutFooterComponent} from './components/layout/layout-footer/layout-footer.component';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {CustomerEditComponent} from './components/customer/customer-edit/customer-edit.component';
import {CustomerAddComponent} from './components/customer/customer-add/customer-add.component';
import { CustomerDeleteComponent } from './components/customer/customer-delete/customer-delete.component';
import {LayoutContentComponent} from './components/layout/layout-content/layout-content.component';
import {MatDialog, MatDialogModule} from '@angular/material/dialog';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { CustomerViewComponent } from './components/customer/customer-view/customer-view.component';
import { NgxPaginationModule } from 'ngx-pagination';
import {Ng2OrderModule} from 'ng2-order-pipe';


@NgModule({

  declarations: [
    AppComponent,
    LayoutContentComponent,
    LayoutHeaderComponent,
    LayoutFooterComponent,
    CustomerListComponent,
    CustomerEditComponent,
    CustomerAddComponent,
    CustomerDeleteComponent,
    CustomerViewComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    MatDialogModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    NgxPaginationModule,
    Ng2OrderModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
