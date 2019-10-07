import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { RouterModule, Router } from '@angular/router';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  constructor(private service:TaskserviceService,private router:Router) { }

  ngOnInit() {
  }

  postTask(taskForm){
    if (taskForm.value.id) {
      this.service.updateData(taskForm.value).subscribe(resData => {
        console.log(resData);
        this.service.getData();
        taskForm.reset();
        this.router.navigateByUrl('/showalltask');
      }, err => {
        console.log(err);
      });
    } else {
    this.service.postData(taskForm.value).subscribe((data) => {
      console.log(data);
      this.service.getData();
      taskForm.reset();
      this.router.navigateByUrl('/showalltask');
    }, err => {
      console.log(err);
    });
  }
  }
}
