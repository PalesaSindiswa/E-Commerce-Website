import { NgModule, NO_ERRORS_SCHEMA  } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MatFormFieldModule,MAT_FORM_FIELD_DEFAULT_OPTIONS, MatFormFieldDefaultOptions } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatDialogModule } from '@angular/material/dialog';
import {
  CategoryComponent,
  OrdersComponent,
  ProductsComponent,
  CartComponent,
  HomeComponent,
  LoginComponent
} from './components';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MeatComponent } from './components/meat/meat.component';
import { ReadymealsComponent } from './components/readymeals/readymeals.component';
import { FruitsComponent } from './components/fruits/fruits.component';
import { MilkComponent } from './components/milk/milk.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { authInterceptorProviders } from './components/helpers/auth.interceptor';
import { RegisterComponent } from './components/register/register.component';
import {MatButtonToggleModule,MatButtonToggle} from '@angular/material/button-toggle';
import { CommonModule ,NgStyle} from '@angular/common';
import { LayoutModule } from '@angular/cdk/layout';
import { MatToolbarModule } from '@angular/material/toolbar';

import { MatSidenavModule } from '@angular/material/sidenav';

import {MatListModule} from '@angular/material/list';


import { RouterModule} from '@angular/router';

import { MatCardModule} from '@angular/material/card';







import {MatBadgeModule} from '@angular/material/badge';
import { MatTableModule} from '@angular/material/table';

import {MatMenuModule} from '@angular/material/menu';

import {MatPaginatorModule} from '@angular/material/paginator';
import {MatSelectModule} from '@angular/material/select';



const appearance: MatFormFieldDefaultOptions = {
  appearance: 'outline'
};


@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    OrdersComponent,
    CategoryComponent,
    CartComponent,
    LoginComponent,


    HomeComponent,
    MeatComponent,
    ReadymealsComponent,
    FruitsComponent,
    MilkComponent,
    HeaderComponent,
    FooterComponent,
    RegisterComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule ,
     HttpClientModule,
     MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    MatDialogModule,
    MatButtonToggleModule,
    CommonModule,
    MatSelectModule,
    MatPaginatorModule,
    MatMenuModule,
    MatTableModule,
    MatBadgeModule,
 MatToolbarModule,
 LayoutModule,
 MatSidenavModule,
 MatListModule,
 RouterModule,
 MatCardModule,
 MatBadgeModule,
 RouterModule.forRoot([]),
 MatButtonToggleModule,



],
exports: [
  MatButtonModule,
  MatFormFieldModule,
  MatInputModule,
  MatDialogModule


],
  providers: [

    authInterceptorProviders,
    {
      provide: MAT_FORM_FIELD_DEFAULT_OPTIONS,
      useValue: appearance
    }


  ],
  bootstrap: [AppComponent]
})


export class AppModule { }

