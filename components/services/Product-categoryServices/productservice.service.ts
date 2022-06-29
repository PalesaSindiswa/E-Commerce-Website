
import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import { Product } from '../../Models/product';

const URL = 'http://localhost:8080/products';

@Injectable({
  providedIn: 'root'
})
export class ProductserviceService {


  constructor(private http: HttpClient) {
  }
  headers = new HttpHeaders({ 'Content-Type': 'application/json' });

  postProduct(product: FormData): Observable<any>{
    return this.http.post(URL + '', product);
  }
  findAllProducts(): Observable<Product[]>{
      return this.http.get<Product[]>(URL);
    }
  findAllProductsByCategory(category: any): Observable<Product[]>{
    return this.http.get<Product[]>(URL + `/categories/${category}`);
  }
  findProductByName(name: any): Observable<boolean> {
    return this.http.get<boolean>( URL + `?name=${name}`);
  }
  findProductById(id: any): Observable<Product> {
    return this.http.get<Product>( URL + `?id=${id}`);
  }
  updateProductById(id: any, product: FormData): Observable<any>{
    return this.http.put(URL + `/${id}`, product);
  }
  deleteProductById(id: any): Observable<any>{
    return this.http.delete(URL + `/${id}`);
  }
}
