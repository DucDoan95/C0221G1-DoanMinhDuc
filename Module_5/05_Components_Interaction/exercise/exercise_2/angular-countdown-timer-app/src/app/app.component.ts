import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  timeIn: any;
  timeOut: any;
  display(value) {
    this.timeOut = value;
  }
}
