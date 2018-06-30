import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {
  data: Object;
  loading: boolean;
  constructor(private http: HttpClient, private router: Router) { }
  ngOnInit() {
  }
  authenticate(auth) {
    if (auth.id == 123 && auth.password == '123') {
       this.router.navigateByUrl('/getData');
    } else {
      alert('Invalid credentials');
    }
  /*this.http.post('test/rest/myresource/valid', {
      id: auth.id,
      password: auth.password,
    })
      .subscribe(
        (res: any) => {
          console.log(res);
          if (res != null) {
             this.router.navigateByUrl('/getData');
          } else {
            alert('Invalid Credentials');
          }
        },
        err => {
          console.log('Error occured');
        }
      );*/
  }
  authUser(auth) {
  this.http.post('test/rest/myresource/validUser', {
      uname: auth.uname,
      password: auth.password,
    })
      .subscribe(
        (res: any) => {
          console.log(res);
            this.router.navigateByUrl('eventreg');
        },
        err => {
          console.log('Error occured');
        }
      );
  }
}
