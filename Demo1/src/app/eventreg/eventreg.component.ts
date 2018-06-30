import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {FlashMessageModule} from 'angular-flash-message';

@Component({
  selector: 'app-eventreg',
  templateUrl: './eventreg.component.html',
  styleUrls: ['./eventreg.component.css'],
  
})
export class EventregComponent implements OnInit {

  data: Object;
  loading: boolean;

  constructor(private http: HttpClient) { }
  ngOnInit() {
  }
  submit(register) {
  this.http.post('test/rest/myresource/evententry', {
      uname: register.uname,
      event: register.event,
      decoration: register.decoration,
      catering: register.catering,
      photography: register.photography,
      venue: register.venue,
      date: register.date,
    })
      .subscribe(
        (res: any) => {
          console.log(res);
      });
  }

}
