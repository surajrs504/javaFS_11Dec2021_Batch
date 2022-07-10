import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-addquestion',
  templateUrl: './addquestion.component.html',
  styleUrls: ['./addquestion.component.css']
})
export class AddquestionComponent implements OnInit {
qiud:any;
question={
  qi:{
    quizinfoid:''
  },
  qcontent:'',
  option1:'',
  option2:'',
  option3:'',
  option4:'',
  answer:''


}
  constructor(private routerr:ActivatedRoute, private es:UserserviceService) { }

  ngOnInit(): void {
    this.qiud=this.routerr.snapshot.params['quizinfoid'];
    console.log("thisi si addquestion qid"+this.qiud)
    this.question.qi['quizinfoid']=this.qiud;




  }
  onsubmit(){
console.log(this.question.qcontent);
this.es.addquestion(this.question).subscribe(data=>{
  console.log("data insterted");
  if(Object.keys(data).length!=0){
    alert("question added")
  }else{
    alert("question not added")
  }
})
  }
}
