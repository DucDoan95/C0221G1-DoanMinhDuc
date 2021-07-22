import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.scss']
})
export class CalculatorComponent implements OnInit {
  numA ;
  numB ;
  result ;

  changeNumA(event: any) {
    this.numA = parseInt(event.value);
  }

  changeNumB(event: any) {
    this.numB = parseInt(event.value);
  }

  addNumber() {
    this.result  = this.numA  + this.numB;
  }
  subNumber() {
    this.result  = this.numA  - this.numB;
  }
  mulNumber() {
    this.result  = this.numA  * this.numB;
  }
  divNumber() {
    this.result  = this.numA  / this.numB;
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
