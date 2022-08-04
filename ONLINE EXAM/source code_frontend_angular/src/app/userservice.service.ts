import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Logindetails } from './logindetails';
import { Userdetails } from './userdetails';

import { Trackid } from './trackid';
import { Categorymodel } from './categorymodel';
import { Quizinfomodel } from './quizinfomodel';
import { ReturnStatement } from '@angular/compiler';
import { Quizquestionmodel } from './quizquestionmodel';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  public user: Userdetails;
  private baseUrl = "http://localhost:8080/user/users";
  private baseurl = "http://localhost:8080/user/adduser";
  private loginurl = "http://localhost:8080/user/login";
  private admindet = "http://localhost:8080/user/adminprofile";
  private categoryurl = "http://localhost:8080/category/all";
  private addcategoryurl = "http://localhost:8080/category/add";
  private viewquizurl = "http://localhost:8080/quizinfo/findall";
  private addquizurl = "http://localhost:8080/quizinfo/add";
  private delquizurl = "http://localhost:8080/quizinfo/del";
  private fetchquestionurl = "http://localhost:8080/questions/findbyid";
  private addquestionurl = "http://localhost:8080/questions/save";
  private delquestionurl = "http://localhost:8080/questions/delbyid";

  constructor(private httpc: HttpClient) { }
  getuserlist(): Observable<Userdetails[]> {
    return this.httpc.get<Userdetails[]>(`${this.baseUrl}`);

  }

  createEmployees(us: Userdetails): Observable<Object> {
    return this.httpc.post(`${this.baseurl}`, us);
  }

  logincheck(ld: Logindetails) {
    return this.httpc.post<any>(`${this.loginurl}`, ld);
}
getcategorylist():Observable<Categorymodel[]>{
  return this.httpc.get<Categorymodel[]>(`${this.categoryurl}`);
}

addcategory(cat:Categorymodel){
  return this.httpc.post<any>(`${this.addcategoryurl}`,cat);
}

viewquizes():Observable<Quizinfomodel[]>{
return this.httpc.get<Quizinfomodel[]>(`${this.viewquizurl}`);
}

addquiz(addq: any){
  console.log("inside adquiz service"+Object.values(addq));
  return this.httpc.post<any>(`${this.addquizurl}`,addq)
  
}

deletequiz(quizinfoid:Quizinfomodel){
  console.log("inside delquiz service"+quizinfoid);
  return this.httpc.post<any>(`${this.delquizurl}`,quizinfoid)

}

getquestions(qid:any) {
  return this.httpc.get<any>(`${this.fetchquestionurl}/${qid}`);

}

addquestion(question:any){
  return this.httpc.post<any>(`${this.addquestionurl}`,question);
}

deletequestion(qid:any){
  return this.httpc.get<any>(`${this.delquestionurl}/${qid}`)

}
  // adminlogin(ad:Trackid):Observable<any>{
  //   return this.httpc.post(`${this.admindet}`, ad);
  // }

}
