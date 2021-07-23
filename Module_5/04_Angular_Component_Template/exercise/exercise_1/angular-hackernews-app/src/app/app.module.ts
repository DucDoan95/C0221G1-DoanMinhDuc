import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {ArticleComponent} from './article/article.component';
import {FormsModule} from '@angular/forms';
import {LikeComponent} from './like/like.component';
import {NavbarComponent} from './navbar/navbar.component';
import {FooterComponent} from './footer/footer.component';
import {NgxPaginationModule} from 'ngx-pagination';
import {Routes, RouterModule} from '@angular/router';
import { IndexPageComponent } from './index-page/index-page.component';

const routesConfig: Routes = [
  {path: 'navBar', component: NavbarComponent},
  {path: 'footer', component: FooterComponent},
  {path: 'article', component: ArticleComponent},
  {path: '', redirectTo: '/article', pathMatch: 'full'},
];

@NgModule({
  declarations: [
    AppComponent,
    ArticleComponent,
    LikeComponent,
    NavbarComponent,
    FooterComponent,
    IndexPageComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NgxPaginationModule,
    RouterModule.forRoot(routesConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
