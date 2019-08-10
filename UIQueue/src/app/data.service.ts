import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getAllQueueDetails(){
    console.log('http://localhost:8181/queue/api/getmessagequeue/getAllQueue');
    return this.http.get('http://localhost:8181/queue/api/getmessagequeue/getAllQueue');
  }

pushMessage(){
  console.log('http://localhost:8181/queue/api/getmessagequeue/getAllQueue');
    return this.http.get('http://localhost:8181/queue/api/getmessagequeue/getAllQueue');
  }



popMessage(){
  console.log('http://localhost:8181/queue/api/getmessagequeue/getAllQueue');
  return this.http.get('http://localhost:8181/queue/api/getmessagequeue/getAllQueue');
}




}
