import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { GetdataComponent } from './getdata/getdata.component';

import { RegisterComponent } from './register/register.component';

import { AdminloginComponent } from './adminlogin/adminlogin.component';

import { EventregComponent } from './eventreg/eventreg.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { WeddingComponent } from './wedding/wedding.component';
import { FormalpartiesComponent } from './formalparties/formalparties.component';
import { BirthdaypartiesComponent } from './birthdayparties/birthdayparties.component';
import { FestivalsComponent } from './festivals/festivals.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  { path: '\getData', component: GetdataComponent, pathMatch: 'full' },
  { path: 'eventreg', component: EventregComponent, pathMatch: 'full' },
  { path: 'register', component: RegisterComponent, pathMatch: 'full' },
  { path: 'wedding', component: WeddingComponent, pathMatch: 'full' },
  { path: 'adminlogin', component: AdminloginComponent, pathMatch: 'full' },
  { path: 'formal', component: FormalpartiesComponent, pathMatch: 'full' },
  { path: 'festival', component: FestivalsComponent, pathMatch: 'full' },
  { path: 'birthday', component: BirthdaypartiesComponent, pathMatch: 'full' },
  { path: 'about', component: AboutusComponent },
  { path: '\home', component: HomeComponent },
];
@NgModule({
  declarations: [
    AppComponent,
    GetdataComponent,
    RegisterComponent,
    
    AdminloginComponent,
    EventregComponent,
    AboutusComponent,
    WeddingComponent,
    FormalpartiesComponent,
    BirthdaypartiesComponent,
    FestivalsComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
