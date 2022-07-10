import { Component, OnInit } from '@angular/core';
import { Categorymodel } from '../categorymodel';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-addcategory',
  templateUrl: './addcategory.component.html',
  styleUrls: ['./addcategory.component.css']
})
export class AddcategoryComponent implements OnInit {
addcat:Categorymodel=new Categorymodel;
  constructor( private addcatservice:UserserviceService) { }
  savecategory(){
    this.addcatservice.addcategory(this.addcat).subscribe(data =>{
      console.log("hello"+data);
    })}

  ngOnInit(): void {
  }
  onsubmit(){
    this.savecategory();
  }

}
