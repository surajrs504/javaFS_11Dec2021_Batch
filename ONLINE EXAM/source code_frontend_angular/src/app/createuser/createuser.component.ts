import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Userdetails } from '../userdetails';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-createuser',
  templateUrl: './createuser.component.html',
  styleUrls: ['./createuser.component.css']
})
export class CreateuserComponent implements OnInit {
  cu :Userdetails=new Userdetails;
  constructor( private es:UserserviceService, private rou :Router) { }

  saveuser(){
    this.es.createEmployees(this.cu).subscribe(data => {
      console.log(data);
      this.gotouserlist();
    })
    
  }
  gotouserlist(){
    this.rou.navigate(['showuser']);
  }

  ngOnInit(): void {
  }
  onSubmit(){
    console.log(this.cu);
    this.saveuser();
    }

}
