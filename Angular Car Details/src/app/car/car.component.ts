import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {
  carsData:any='';
  sendCars(cars){
  this.carsData=cars;
  };
  car=[
    {
      brand: 'bmw',
      img: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408_960_720.jpg',
      description: 'Lorem ipsum dolor sit amet consectetur, adipisicing elit. Accusantium sed earum esse voluptates consequuntur voluptas nostrum adipisci aut dolor totam.',
    },
    {
      brand: 'royal',
      img: 'https://cdn.pixabay.com/photo/2017/09/03/21/15/rolls-royce-2712120_960_720.png',
      description: 'Lorem ipsum dolor sit amet consectetur, adipisicing elit. Accusantium sed earum esse voluptates consequuntur voluptas nostrum adipisci aut dolor totam.',
    },
    {
      brand: 'hyundai',
      img: 'https://cdn.pixabay.com/photo/2014/03/28/00/18/all-wheel-drive-299772_960_720.jpg',
      description: 'Lorem ipsum dolor sit amet consectetur, adipisicing elit. Accusantium sed earum esse voluptates consequuntur voluptas nostrum adipisci aut dolor totam.',
    },
    {
      brand: 'audi',
      img: 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019_960_720.jpg',
      description: 'Lorem ipsum dolor sit amet consectetur, adipisicing elit. Accusantium sed earum esse voluptates consequuntur voluptas nostrum adipisci aut dolor totam.',
    },
  
  
  ]

  

  constructor() { }

  ngOnInit() {
  }

}
