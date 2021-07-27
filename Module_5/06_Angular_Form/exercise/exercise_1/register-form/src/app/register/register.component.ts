import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {User} from '../user';
import {AbstractControl, FormControl, FormGroup, ValidationErrors, Validators} from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
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
    'config_password': [
      {type: 'required', message: 'Config Password Not null'},
      {type: 'minlength', message: 'Config Password >6 char'},
    ],
    'groupPW': [
      {type: 'invalid0', message: 'Password != Config Password'}
    ],
    'age': [
      {type: 'required', message: 'Age Not null'},
      {type: 'min', message: 'Age > 18'}
    ],
    'phone': [
      {type: 'required', message: 'Phone Not null'},
      {type: 'pattern', message: 'Phone wrong format'}
    ],

  };
  constructor() {
    // @ts-ignore
    this.userForm = new FormGroup({
      email: new FormControl('', [Validators.required,Validators.email]),
      groupPW: new FormGroup({
        password: new FormControl('', [Validators.required,Validators.minLength(6)]),
        config_password: new FormControl('', [Validators.required,Validators.minLength(6)])
      },[this.comparePassword]),
      // password: new FormControl('', [Validators.required,Validators.minLength(6)]),
      // config_password: new FormControl('', [Validators.required,Validators.minLength(6),this.validateConfigPassword]),
      age: new FormControl('', [Validators.required,Validators.min(18)]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required,Validators.pattern(/^\+84\d{9,10}$/)])
    });
  }

  createUser() {
    console.log(this.userForm);
    if (this.userForm.valid) {
      this.submitCreateUser.emit(this.userForm.value);
    } else {
      alert('Form error !!!');
    }
  }
   comparePassword(c: AbstractControl): ValidationErrors | null {
     const v = c.value;
     if (v.password != v.config_password) {
       return {'invalid0': true}
     } else {
       return null
     }
   }
  ngOnInit(): void {
  }

}
