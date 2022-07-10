import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Logindetails } from '../logindetails';
import { Userdetails } from '../userdetails';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
ld:Logindetails=new Logindetails;
user:Userdetails;
public disp:boolean;
public director:object;
  constructor(private lu:UserserviceService, private rou :Router) { }
  saveuser(){
    this.lu.logincheck(this.ld).subscribe(data =>{
      console.log("hello"+data);
    if(data){
        localStorage.setItem("currentuser",JSON.stringify(data));
        const dir=JSON.parse(localStorage.getItem('currentuser')!);
       
    
       console.log("this is"+typeof(localStorage.getItem('currentuser')));

     console.log("this is dir "+dir.id);
    
    

      if(dir.id==1){ 
        this.gotorespectivepage();
      }
      else if(dir.id>1){
         this.gotostudentpage();
      }
    }
    else{
      this.disp=true;
    }
    })
  
  
  }

  gotorespectivepage(){
    this.rou.navigate(['dashboard']);
  }
gotoregister(){
  this.rou.navigate(['createuser']);
}
gotostudentpage(){
  this.rou.navigate(['studentdashboard']);
}
  
    
  ngOnInit(): void {
  }
onsubmit(){
this.saveuser();

}
}
