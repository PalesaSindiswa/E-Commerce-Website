import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Category } from '../../Models/category';
import { Observable } from "rxjs";
import { map } from 'rxjs/operators';

const URL = 'http://localhost:8080/categories';


@Injectable({
  providedIn: 'root'

})

export class CategoryListService {



  constructor(private http: HttpClient) { }

  postCategory(category: FormData): Observable<any>{
    return this.http.post(URL + '', category);
  }

  findAllCategories(): Observable<Category[]>{
    return this.http.get<Category[]>(URL);
  }
  // findAllProductsByCategory(category): Observable<Product[]>{
  //   return this.http.get<Product[]>(URL + `/categories/${category}`);
  // }
  findCategoryByName(name: any): Observable<boolean> {
    return this.http.get<boolean>( URL + `?name=${name}`);
  }
  updateCategoryById(id: any, category: FormData): Observable<any>{
    return this.http.put(URL + `/${id}`, category);
  }
  deleteCategoryById(id: any): Observable<any>{
    return this.http.delete(URL + `/${id}`);
  }


}
