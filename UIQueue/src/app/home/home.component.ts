import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

queueDetails;


  constructor(private data: DataService) { }

  ngOnInit() {
    this.data.getAllQueueDetails().subscribe(data => {
      console.log(data);
      this.queueDetails = data;
    }
    
      );
  }

pushMessage(){
 
  this.data.pushMessage().subscribe(data => {
    console.log(data);
    this.queueDetails = data;
  }
  
    );
}

popMessage(){
  this.data.popMessage().subscribe(data => {
    console.log(data);
    this.queueDetails = data;
  }
  
    );
}


}
