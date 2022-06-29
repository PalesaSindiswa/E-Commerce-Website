import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent, OrdersComponent, ProductsComponent, MeatComponent,ReadymealsComponent,FruitsComponent,MilkComponent, CategoryComponent,LoginComponent,RegisterComponent} from './components';
import { CartComponent } from './components/cart/cart.component';

const routes: Routes = [
  {
    path: 'product',
    component: ProductsComponent
  },
  {
    path: 'cart',
    component: CartComponent
  },
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'orders',
    component: OrdersComponent
  },
  {
    path: 'meat',
    component: MeatComponent
  },
  {
    path: 'readymeals',
    component: ReadymealsComponent
  },
  {
    path: 'fruits',
    component: FruitsComponent
  },
  {
    path: 'milk',
    component: MilkComponent
  },
  {
    path: 'category',
    component: CategoryComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'Register',
    component: RegisterComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule { }
