import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Quizinfomodel } from '../quizinfomodel';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-studentviewquiz',
  templateUrl: './studentviewquiz.component.html',
  styleUrls: ['./studentviewquiz.component.css']
})
export class StudentviewquizComponent implements OnInit {
  qid:any;
  qtitle:any;
  viewquiz:Quizinfomodel[];
  constructor(private viewq:UserserviceService, private rout:ActivatedRoute) { }

  ngOnInit(): void {
    console.log("hello this ngoninit")
    this.viewallquiz();
  }
  viewallquiz(){
    this.viewq.viewquizes().subscribe(data =>{
      console.log("this is view quiz"+JSON.stringify(data));
      this.viewquiz=data;
      
    }) 
  }
}
