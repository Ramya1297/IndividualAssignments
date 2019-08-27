import { Component, OnInit } from '@angular/core';

import {HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-transfer',
  templateUrl: './transfer.component.html',
  styleUrls: ['./transfer.component.css']
})
export class TransferComponent implements OnInit {

 public from_acc_num="";
 public to_acc_num="";
 public amount;
 public check="";
 public status:string="";
constructor(private objHttp:HttpClient){

}

  ngOnInit() {
  }
  
  click(){
    if(window.confirm('Are sure you to transfer ?')){
      this.Transfer();
    return true;
   }
   return false;
}
handleClick(){
  if(window.confirm('This is not allowed here.!!')){
    return true;
   }
   return false;
}
Transfer(){
  this.objHttp.post("http://localhost:8078/web/transfer",
  {
 	
      "from_acc_num":this.from_acc_num,
      "to_acc_num":this.to_acc_num,
      "amount":this.amount
    
  })
  .toPromise()
  .then(
      data => {
          console.log("Transaction is successful ", data);
          this.status = "Transaction is successful";
      },
      error => {
          console.log("Error", error);
          this.status = "Error";
      }
  );    

  if(window.confirm(this.status)){
    return true;
   }
   return false;
}
}
