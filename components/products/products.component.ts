import { Component, OnInit } from '@angular/core';
import { Product } from '../Models/product';
import { ProductserviceService } from '../services/Product-categoryServices/productservice.service';
import { Category } from '../Models/category';
import { CategoryListService } from '../services/Product-categoryServices/category-list.service';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss'],

})
export class ProductsComponent implements OnInit {

  mealType: any;
  dataSource: Product[] = [];
  categories: Category[] = [];
  cartService: any;

  constructor(public productService: ProductserviceService, private categoryService: CategoryListService) {
  }

  ngOnInit(): void {
    this.getAllProducts();

    this.getAllCategories();
  }
  filterCategoryOption(category: Category){
    this.productService.findAllProductsByCategory(category).subscribe(data => this.dataSource = data);
    console.log('allProds');
  }
  getAllCategories(){
    this.categoryService.findAllCategories().subscribe(data => this.categories = data);
    console.log('allCats');
  }

  addToCart(food: Product){
    this.cartService.addToCart(food);
  }
  getAllProducts(): void{
    this.productService.findAllProducts().subscribe(data => this.dataSource = data);
   // console.log(this.dataSource.length);
  }

}
