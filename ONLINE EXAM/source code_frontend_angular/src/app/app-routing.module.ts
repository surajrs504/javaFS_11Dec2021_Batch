import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent } from './dashboard/dashboard.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { CreateuserComponent } from './createuser/createuser.component';

import { LoginComponent } from './login/login.component';
import { NormalDashboardComponent } from './normal-dashboard/normal-dashboard.component';
import { UserlistComponent } from './userlist/userlist.component';
import { AuthenticateGuard } from './authenticate.guard';
import { ProfileComponent } from './profile/profile.component';
import { AdmincategoryComponent } from './admincategory/admincategory.component';
import { AddcategoryComponent } from './addcategory/addcategory.component';
import { AdminviewquizesComponent } from './adminviewquizes/adminviewquizes.component';
import { AdminaddquizComponent } from './adminaddquiz/adminaddquiz.component';
import { AdminquizquestionsComponent } from './adminquizquestions/adminquizquestions.component';
import { AddquestionComponent } from './addquestion/addquestion.component';
import { StudentdashboardComponent } from './studentdashboard/studentdashboard.component';
import { StudentviewquizComponent } from './studentviewquiz/studentviewquiz.component';
import { StudentprofileComponent } from './studentprofile/studentprofile.component';
import { AttemptquizComponent } from './attemptquiz/attemptquiz.component';

const routes: Routes = [
  {
    path:'dashboard',
    canActivate:[AuthenticateGuard],
    component: DashboardComponent,
   children:[{
    path:'side',
    component:ProfileComponent

   },
   {
    path:'category',
    component: AdmincategoryComponent
  },
  {
    path:'addcategory',
    component: AddcategoryComponent
  },
  {
    path:'viewquizes',
    component: AdminviewquizesComponent
  },
  {
    path:'addquizes',
    component: AdminaddquizComponent  
  },
  {
    path:'viewquestion/:quizinfoid/:quiztitle',
    component:AdminquizquestionsComponent
  },
  {
    path:'addquestion/:quizinfoid',
    component:AddquestionComponent
  }
  ]
    
  },
  {
    path:'login',
    component: LoginComponent
  },
  {
    path:'createuser',
    component: CreateuserComponent
  },
  {
    path:'showuser',
    component: UserlistComponent
  },
  {
  path:'studentdashboard',
    canActivate:[AuthenticateGuard],
    component: StudentdashboardComponent,
    children:[{
      path:'side',
      component:StudentprofileComponent
  
     },
     {
      path:'viewquiz',
      component:StudentviewquizComponent
  
     }
     ]
  },
  {
    path:'attemptquiz/:qid/:qtitle',
    component:AttemptquizComponent

   }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
