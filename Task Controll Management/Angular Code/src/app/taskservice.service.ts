import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {map } from 'rxjs/operators'; 
import { Task } from './edittask/task';
@Injectable({
  providedIn: 'root'
})
export class TaskserviceService {

  addurl='http://localhost:8081/task/add';

  selectedTask: Task = {
    task_id: null,
    task: null,
    task_start_date: null,
    task_end_date: null
  };
  constructor(private http:HttpClient) { }
  tasks:any[] = [];
getData() {

 return this.http.get('http://localhost:8081/task/get-all').subscribe(resData=>{
   
      this.tasks=resData.tasks;
  })
  
}
postData(data) {
  return  this.http.post(`${this.addurl}`, data);
}
updateData(data) {
  return this.http.put('http://localhost:8081/task/complete', data);
}
deleteData(data) {
  return this.http.delete(`http://localhost:8081/task/remove/${data}`);
}
 ngDoCheck() {
}
}
