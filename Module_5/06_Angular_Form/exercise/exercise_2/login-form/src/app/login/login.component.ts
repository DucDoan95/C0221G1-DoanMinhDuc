import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  @Output() submitCreateUser = new EventEmitter();
  userForm: FormGroup;
  validate_message = {
    'email': [
      {type: 'required', message: 'Email Not null'},
      {type: 'email', message: 'Email wrong format'}
    ],
    'password': [
      {type: 'required', message: 'Password Not null'},
      {type: 'minlength', message: 'Password >6 char'}
    ],
  };

  constructor() {
    this.userForm = new FormGroup({
      email: new FormControl('', [Validators.required, Validators.email]),
      password: new FormControl('', [Validators.required, Validators.minLength(6)]),
    });
  }

  checkLogin() {
    console.log(this.userForm);
    if (this.userForm.valid) {
      this.submitCreateUser.emit(this.userForm.value);
      alert('login success!');
    } else {
      alert('login error !!!');
    }
  }

  ngOnInit(): void {
  }
}
