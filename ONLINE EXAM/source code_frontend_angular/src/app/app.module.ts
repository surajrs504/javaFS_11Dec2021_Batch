import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { UserlistComponent } from './userlist/userlist.component';
import {MatTableModule} from '@angular/material/table';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CreateuserComponent } from './createuser/createuser.component';
import { FormsModule } from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
import {MatInputModule} from '@angular/material/input';
import {MatCardModule} from '@angular/material/card';
import {MatGridListModule} from '@angular/material/grid-list';
import { LoginComponent } from './login/login.component';
import {MatButtonModule} from '@angular/material/button';
import { NormalDashboardComponent } from './normal-dashboard/normal-dashboard.component';
import {MatSidenavModule} from '@angular/material/sidenav';
import { DashboardComponent } from './dashboard/dashboard.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { ProfileComponent } from './profile/profile.component';
import { AdmincategoryComponent } from './admincategory/admincategory.component';
import { AddcategoryComponent } from './addcategory/addcategory.component';
import { AdminviewquizesComponent } from './adminviewquizes/adminviewquizes.component';
import { AdminaddquizComponent } from './adminaddquiz/adminaddquiz.component';
import { AdminquizquestionsComponent } from './adminquizquestions/adminquizquestions.component';
import { AddquestionComponent } from './addquestion/addquestion.component';
import { StudentdashboardComponent } from './studentdashboard/studentdashboard.component';
import { StudentsidenavComponent } from './studentsidenav/studentsidenav.component';
import { StudentviewquizComponent } from './studentviewquiz/studentviewquiz.component';
import { StudentprofileComponent } from './studentprofile/studentprofile.component';
import { AttemptquizComponent } from './attemptquiz/attemptquiz.component';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatCheckboxModule} from '@angular/material/checkbox';

@NgModule({
  declarations: [
    AppComponent,
    UserlistComponent,
    CreateuserComponent,
    LoginComponent,
    NormalDashboardComponent,
    DashboardComponent,
    SidenavComponent,
    ProfileComponent,
    AdmincategoryComponent,
    AddcategoryComponent,
    AdminviewquizesComponent,
    AdminaddquizComponent,
    AdminquizquestionsComponent,
    AddquestionComponent,
    StudentdashboardComponent,
    StudentsidenavComponent,
    StudentviewquizComponent,
    StudentprofileComponent,
    AttemptquizComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatTableModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule,
    MatFormFieldModule,
    MatSelectModule,
    MatInputModule,
    MatCardModule,
    MatGridListModule,
    MatButtonModule,
    MatSidenavModule,
    MatToolbarModule,
    MatCheckboxModule
   
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
