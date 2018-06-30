import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-getdata',
  templateUrl: './getdata.component.html',
  styleUrls: ['./getdata.component.css']
})
export class GetdataComponent implements OnInit {
  data;
  user;
  constructor(private http: HttpClient) { }
  ngOnInit() {
  }
  getDataFunc(event) {
      this.http.get('https://jsonplaceholder.typicode.com/posts').subscribe(res => this.data = res);
    console.log(this.data);
  }
  getAll(event) {
     this.http.get('test/rest/myresource/getAll').subscribe(res => this.data = res);
    console.log(this.data);
   }
}
