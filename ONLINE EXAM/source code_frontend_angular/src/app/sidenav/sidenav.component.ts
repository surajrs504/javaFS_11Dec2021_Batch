import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent implements OnInit {

  
  constructor() {
    console.log("inside side nav compnent")
   }
//   saveuserredirect(){
// this.ad.saveuser();
//   }

  ngOnInit(): void {
  }

  logout(){
    localStorage.removeItem('currentuser');
    location.reload();
}

}
