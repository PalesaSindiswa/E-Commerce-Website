import { Component, OnInit } from '@angular/core';
import { Form, Validators } from '@angular/forms';
import { AuthServiceService } from '../services/Auth/auth-service.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  form: any = {

email:null,
  name: null,
  password:null,
  username: null
  };
  isSuccessful = false;
  isSignUpFailed = false;
  errorMessage = '';
  constructor(private authService: AuthServiceService) { }
  ngOnInit(): void {
  }
  onSubmit(): void {
    const { email,name, password, username } = this.form;
    this.authService.registerUser(email,name, password, username ).subscribe({
      next: data => {
        console.log(data);
        this.isSuccessful = true;
        this.isSignUpFailed = false;
      },
      error: err => {
        this.errorMessage = err.error.message;
        this.isSignUpFailed = true;
      }
    });
  }


}
