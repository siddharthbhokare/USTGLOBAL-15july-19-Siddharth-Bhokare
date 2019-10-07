import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { Router } from '@angular/router';
import { Task } from './task';

@Component({
  selector: 'app-edittask',
  templateUrl: './edittask.component.html',
  styleUrls: ['./edittask.component.css']
})
export class EdittaskComponent implements OnInit {

 
  constructor(private service:TaskserviceService ,private router:Router) { }

  completeTask(task) {
    this.service.updateData(task).subscribe(data=>{
console.log(data);
this.router.navigateByUrl('/showalltask');
    })
   
  }
  deleteTask(task) {
    this.service.deleteData(task).subscribe(resData => {
      console.log(resData);
      this.router.navigateByUrl('/showalltask');
      this.service.getData();
    });
  }
  ngOnInit() {
    this.service.getData();
    console.log(this.service.tasks);
  }

}
