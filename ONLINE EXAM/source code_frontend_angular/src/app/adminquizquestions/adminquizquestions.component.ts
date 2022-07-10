import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Quizinfomodel } from '../quizinfomodel';
import { Quizquestionmodel } from '../quizquestionmodel';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-adminquizquestions',
  templateUrl: './adminquizquestions.component.html',
  styleUrls: ['./adminquizquestions.component.css']
})
export class AdminquizquestionsComponent implements OnInit {
  
qid:any;
qidobject:any;
qtitle:any;
quizinfo:Quizinfomodel;
quizquestion=[];
  constructor( private routerr:ActivatedRoute, private quest:UserserviceService) { }

  ngOnInit(): void {
    
  this.qid=this.routerr.snapshot.params['quizinfoid'];
  this.qtitle=this.routerr.snapshot.params['quiztitle'];

  this.qidobject={
    qidd:this.qid
  }
// this.quizinfo.quiztitle=this.qtitle;
this.quest.getquestions(this.qidobject.qidd).subscribe(data=>{
  console.log(data);
  this.quizquestion=data;
})


  console.log("id="+this.qid+"tiddtle"+this.qtitle+"dssasasds")
  }

  deletebyid(id:any){
    this.quest.deletequestion(id).subscribe(data=>{
      alert("questiondeleted");
      location.reload();
    })
console.log(id);
  }
}
