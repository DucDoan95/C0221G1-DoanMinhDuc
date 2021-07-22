import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.scss']
})
export class ColorComponent implements OnInit {
  color = 'red';
  colorBR = 'white';

  changeColor(event: any) {
    this.color = event.value;
  }
  changeColorBR(event: any) {
    this.colorBR = event.value;
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
