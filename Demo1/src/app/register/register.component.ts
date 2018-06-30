import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit {
  data: Object;
  loading: boolean;

  constructor(private http: HttpClient) { }
  ngOnInit() {
  }
  submit(register) {
    alert('Successfully registered'),
  this.http.post('test/rest/myresource/userentry', {
      name: register.name,
      uname: register.uname,
      email: register.email,
      mobile: register.mobile,
      password: register.password,
    })
      .subscribe(
        (res: any) => {
          console.log(res);
        },
        err => {
          console.log('Error occured');
        }
      );
  }
  updater(upd) {
  this.http.put('test/rest/myresource/update', {
      name: upd.name,
      id: upd.id
    })
      .subscribe(
        (res: any) => {
          console.log(res);
        },
        err => {
          console.log('Error occured');
        }
      );
  }

  deleter(del) {
  this.http.post('test/rest/myresource/deleterow', {
      name: del.name,
      id: del.id
    })
      .subscribe(
        (res: any) => {
          console.log(res);
        },
        err => {
          console.log('Error occured');
        }
      );
  }
  /* updater(up) {
     this.http.put('test/rest/myresource/}', {
       name: up.name,
       id: up.id
    })
      .subscribe(
        (res: any) => {
          console.log(res);
        },
        err => {
          console.log('Error occured');
        }
      );
  }*/
}



