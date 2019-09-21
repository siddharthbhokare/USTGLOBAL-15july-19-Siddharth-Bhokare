import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class FirebaseService {

  
  url="https://task-3b355.firebaseio.com/";

  constructor(private http : HttpClient) { }
  sendData(data){
   return this.http.post(`${this.url}/task.json`,data);
  }

  getData(){
   return this.http.get(`${this.url}/task.json`).pipe(map(data=>{
      let newArray:any[]=[];
      for(let key in data){
        newArray.push({...data[key],id:key});
      }
      return newArray;
    }))
  }

 deleteData(key){
    return this.http.delete(`${this.url}/task/${key}.json`)
  }
}
