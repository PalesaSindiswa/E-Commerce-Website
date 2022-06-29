import { Product } from "./product";
export class Category {
  id: number;
  name: string;
  description:string;
  products: Product[];

  constructor(id:number, name:string, products:Product[], description:string)
  {
    this.id=id;
    this.name=name;
    this.description=description
    this.products=products;
  }
}
