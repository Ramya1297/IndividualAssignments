import { Component, OnInit } from '@angular/core';

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
 /*
  constructor(pfrom,pto,pam) {
  this.to_acc_num=pto;
  this.from_acc_num=pfrom;
  this.amount=pam;
   }
*/
constructor(){

}
  ngOnInit() {
  }
  
  click(){
    if(window.confirm('Are sure you to transfer ?')){
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

}
