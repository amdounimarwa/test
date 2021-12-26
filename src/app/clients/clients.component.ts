import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-clients',
  templateUrl: './clients.component.html',
  styleUrls: ['./clients.component.css']
})
export class ClientsComponent implements OnInit {
private clients:any;

  constructor(private httpClient:HttpClient) { }

  ngOnInit(): void {
  }
  OnGetClient(){
     this.httpClient.get("http://localhost:8080/clients")
     .subscribe(data=>{
       this.clients=data;
       },err=>{
       console.log(err);
       })

     }

  }

