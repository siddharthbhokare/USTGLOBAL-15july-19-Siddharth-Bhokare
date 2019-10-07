import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TaskserviceService } from '../taskservice.service';

@Component({
  selector: 'app-showalltask',
  templateUrl: './showalltask.component.html',
  styleUrls: ['./showalltask.component.css']
})
export class ShowalltaskComponent implements OnInit {

tasksData=[];
  constructor(private service:TaskserviceService) { 

  }

  ngOnInit() {
    this.service.getData();
    console.log(this.service.tasks);
  }

}
