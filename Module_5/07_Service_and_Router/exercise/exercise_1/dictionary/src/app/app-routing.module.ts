import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {DictionaryDetailComponent} from './dictionary/dictionary-detail/dictionary-detail.component';
import {DictionaryPageComponent} from './dictionary/dictionary-page/dictionary-page.component';


const routes: Routes = [
  {
    path: 'dictionary/view/:id',
    component: DictionaryDetailComponent
  },
  {
    path: 'dictionary/list',
    component: DictionaryPageComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
