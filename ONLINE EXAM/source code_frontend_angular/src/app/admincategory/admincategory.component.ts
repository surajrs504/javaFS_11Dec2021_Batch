import { Component, OnInit } from '@angular/core';
import { Categorymodel } from '../categorymodel';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-admincategory',
  templateUrl: './admincategory.component.html',
  styleUrls: ['./admincategory.component.css']
})
export class AdmincategoryComponent implements OnInit {
category:Categorymodel[];
  constructor( private cat:UserserviceService) { }

  ngOnInit(): void {
    this.getuser();
    console.log("helloo");
  }
  private getuser(){
    this.cat.getcategorylist().subscribe ((data) =>{
      console.log("helloo");
      console.log(data);
      this.category=data;
      
    }) 
  }
  displayedColumns: string[] = ['category', 'categorycategorytitle', 'categorycategorydescription'];

}
