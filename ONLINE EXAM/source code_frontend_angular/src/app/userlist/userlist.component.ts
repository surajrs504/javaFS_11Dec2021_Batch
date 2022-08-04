import { Component, OnInit } from '@angular/core';
import { Userdetails } from "../userdetails";
import { UserserviceService } from '../userservice.service';
@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {


  userdet: Userdetails[];
  constructor(private es:UserserviceService) {
    
  }
  displayedColumns: string[] = ['id', 'username', 'firstname', 'symbol','dsds','dsdsd','dsdsdsd','sddsd'];
 
 


  ngOnInit(): void {
this.getuser();

   
  }

  private getuser(){
    this.es.getuserlist().subscribe(data =>{
      console.log(data);
      this.userdet=data;
      
    }) 
  }

}
