import { Component, OnInit } from '@angular/core';
import { Categorymodel } from '../categorymodel';
import { Quizinfomodel } from '../quizinfomodel';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-adminaddquiz',
  templateUrl: './adminaddquiz.component.html',
  styleUrls: ['./adminaddquiz.component.css']
})
export class AdminaddquizComponent implements OnInit {
  addquiz={
    
    quiztitle:'',
      quizdescription:'',
	  quizmaxmarks:'',
	  quiznumofquestions:'',
    categoryquizes:{
      categoryid:''
     
    }
	
  }
  cat:Categorymodel[];
  constructor(private adds: UserserviceService) { }

  ngOnInit(): void {
    this.adds.getcategorylist().subscribe(dataa=>{
      console.log("this is category list "+dataa);
      this.cat=dataa;
    })
    
  }
  addquizes() {
    this.adds.addquiz(this.addquiz).subscribe(data => {
      console.log("thisis add quiz data"+Object.values(data));
      this.addquiz = data

    })
    

   
  }

  categ(){
   

  }

  
  onsubmit(){
    this.addquizes();
  }
}
