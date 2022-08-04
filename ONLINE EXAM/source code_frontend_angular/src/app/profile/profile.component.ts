import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
 // console.log(typeof(localStorage.getItem('currentuser')));
   profile=JSON.parse(localStorage.getItem('currentuser')!);
  //console.log(profile);
  constructor() {
    
   }

  ngOnInit(): void {
    
  }

}
