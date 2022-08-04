import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-attemptquiz',
  templateUrl: './attemptquiz.component.html',
  styleUrls: ['./attemptquiz.component.css']
})
export class AttemptquizComponent implements OnInit {
qid:any;
qtitle:any;
question:any;
checked=true;
crctans:number=0;
result:any;
maxmarks:any;
numq:any;
attempted:any=0;
done=false;

  constructor(private rou:ActivatedRoute, private ser:UserserviceService) { }

  ngOnInit(): void {
this.qid=this.rou.snapshot.params['qid'];
this.qtitle=this.rou.snapshot.params['qtitle'];
console.log("testid anf test title is"+this.qid+this.qtitle)
this.questions();
  }
questions(){
this.ser.getquestions(this.qid).subscribe(data=>{
  console.log("hello"+data);
  
  this.question=data;
  this.question.forEach((q: any) => {
    q['givenanswer']= 'hello';
  });
 
})
}
submit(){
  this.done=true;
  this.question.forEach((q:any)=>{
    if(q.givenanswer=== q.answer){
    console.log(q.givenanswer+""+q.answer)
     this.crctans++;
    }
 
    this.maxmarks=q.qi.quizmaxmarks;
    this.numq=q.qi.quiznumofquestions;
console.log(this.maxmarks);
  })
  this.result=(this.maxmarks/this.numq)*this.crctans;
  console.log("result :"+this.result+"no of corect answer"+this.crctans+"attempted question"+this.attempted);
}

}
