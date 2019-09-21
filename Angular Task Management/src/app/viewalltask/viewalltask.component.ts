import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';

@Component({
  selector: 'app-viewalltask',
  templateUrl: './viewalltask.component.html',
  styleUrls: ['./viewalltask.component.css']
})
export class ViewalltaskComponent implements OnInit {
  users:any=[];
 

  constructor(private service : FirebaseService)  {
    this.getData();
   }
 

getData(){
  this.service.getData().subscribe(data=>{
    this.users=data;
    
  })
  
}
deleteData(i){
  let index=this.users.indexOf(i);
  this.users.splice(index,1);
}

//deleteData(key){
 // this.service.deleteData(key).subscribe(data => {
  //   console.log(data);
  //   this.getData();
  // } , err => {
  //   console.log(err);
  // } , () => {
  //   console.log("data deleted successfully");
  // })



  ngOnInit() {
  }

}

