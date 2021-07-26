import {Component, EventEmitter, Input, OnInit, Output, SimpleChanges} from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.scss']
})
export class CountdownTimerComponent implements OnInit {
  message = '';
  remainingTime: number;
  @Input()
  seconds = 30;
  @Output()
  finish = new EventEmitter();
  private intervalId = 0;

  // ngOnChanges(changes: SimpleChanges) {
  //   if ('seconds' in changes) {
  //     let v = changes.seconds.currentValue;
  //     v = typeof v === 'undefined' ? 11 : v;
  //     const vFixed = Number(v);
  //     this.seconds = Number.isNaN(vFixed) ? 11 : vFixed;
  //   }
  // }

  clearTimer() {
    clearInterval(this.intervalId);
  }

  ngOnInit() {
    this.reset();
  }
  //
  // ngOnDestroy() {
  //   this.clearTimer();
  // }

  start() {
    this.count();
    this.remainingTime = this.seconds;
    if (this.remainingTime <= 0) {
      this.remainingTime = this.seconds;
    }
  }

  stop() {
    this.clearTimer();
    this.message = `Holding at T-${this.remainingTime} seconds`;
  }

  reset() {
    this.clearTimer();
    this.finish.emit(null);
    this.remainingTime = this.seconds;
    this.message = `Click start button to start the Countdown`;
    this.remainingTime = null;
  }

  private countDown() {
    this.clearTimer();
    this.intervalId = window.setInterval(() => {
      this.remainingTime -= 1;
      if (this.remainingTime === 0) {
        this.message = 'Blast off!';
        this.clearTimer();
        this.finish.emit(true);
      } else {
        this.message = `T-${this.remainingTime} seconds and counting`;
      }
    }, 1000);
  }

  private count() {
    this.clearTimer();
    this.intervalId = window.setInterval(() => {
      this.finish.emit(this.remainingTime);
      this.remainingTime -= 1;
      if (this.remainingTime <= 0) {
        this.clearTimer();
        this.finish.emit('Blast off!');
      } else {
        this.finish.emit(`T-${this.remainingTime} seconds and counting`) ;
      }
    }, 1000);
  }
}
