import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-studentsidenav',
  templateUrl: './studentsidenav.component.html',
  styleUrls: ['./studentsidenav.component.css']
})
export class StudentsidenavComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  logout(){
    localStorage.removeItem('currentuser');
    location.reload();
}

}
