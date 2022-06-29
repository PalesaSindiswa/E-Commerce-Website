import { Category } from "./category";


export class Product {
  id: number ;
  name: string;
  price: number;
  description: string;
  fileName: string;
  category: Category;
  constructor(id:number,name:string,price:number,description:string,fileName:string, category: Category){
    this.id=id;
    this.name=name;
    this.price=price;
    this.description=description;
    this.fileName=fileName;
    this.category=category;
  }
}
