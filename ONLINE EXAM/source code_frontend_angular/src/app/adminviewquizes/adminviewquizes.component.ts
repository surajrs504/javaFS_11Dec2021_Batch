import { JsonpClientBackend } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { switchAll } from 'rxjs';
import { Quizinfomodel } from '../quizinfomodel';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-adminviewquizes',
  templateUrl: './adminviewquizes.component.html',
  styleUrls: ['./adminviewquizes.component.css']
})
export class AdminviewquizesComponent implements OnInit {
  qid:Quizinfomodel;
  viewquiz:Quizinfomodel[];
  constructor(private viewq:UserserviceService) { }

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

deletequiz(quizid:any){
  console.log("this is inside delete quiz method"+quizid);



  this.viewq.deletequiz(quizid).subscribe(data=>{
    console.log(data);
    
  })
 
}

}
