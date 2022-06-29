import { Component, OnInit } from '@angular/core';
import { Category } from '../Models/category';
import { ProductserviceService } from '../services/Product-categoryServices/productservice.service';
import { CategoryListService } from '../services/Product-categoryServices/category-list.service';

import { Product } from '../Models/product';
@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.scss']
})


export class CategoryComponent implements OnInit {
  mealType:any;
  dataSource: Product[] = [];
  categories: Category[] = [];

  constructor(public productService:ProductserviceService, private categoryService: CategoryListService) {
  }



  ngOnInit(): void {
    this.getCategories();

  }

  getCategories(): void{
    this.categoryService.findAllCategories().subscribe(data => this.categories = data);
  }


  filterCategoryOption(category: Category){
    this.productService.findAllProductsByCategory(category).subscribe(data => this.dataSource = data);
    console.log('allProds');
  }
  getAllCategories(){
    this.categoryService.findAllCategories().subscribe(data => this.categories = data);
    console.log('allCats');
  }
}
