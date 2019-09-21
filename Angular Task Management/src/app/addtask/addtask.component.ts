import { Component, OnInit } from '@angular/core';
import { FirebaseService } from '../firebase.service';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {
  constructor(private service :  FirebaseService) { }
  sendData(addtask){
   this.service.sendData(addtask).subscribe(data=>{
      console.log(data);
    })
  }

 

  ngOnInit() {
  }

}
