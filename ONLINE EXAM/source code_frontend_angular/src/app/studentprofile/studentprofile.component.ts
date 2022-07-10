import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-studentprofile',
  templateUrl: './studentprofile.component.html',
  styleUrls: ['./studentprofile.component.css']
})
export class StudentprofileComponent implements OnInit {

  constructor() { }
  profile=JSON.parse(localStorage.getItem('currentuser')!);
  ngOnInit(): void {
  }

}
