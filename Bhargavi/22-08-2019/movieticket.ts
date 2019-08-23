class Movie
{
public moviename:string;
public noftickets:number;
public typeofseat:string;
public payment:number;
constructor(moviename:string,noftickets:number,typeofseat:string){
this. moviename=moviename;
this.noftickets=noftickets;
this.typeofseat=typeofseat;
}
displayname()
{
console.log("movie name is: "+this.moviename);
}
displayNoOfTickets()
{
    console.log("number of tickets are: "+this.noftickets);
}
displaytypeofseat()
{
    console.log("type of seat is: "+this.typeofseat);
}
totalpayment()
{
    if(this.typeofseat=="front")
    {
    var n=this.noftickets*50;
    console.log("total payment is: "+n);
    }
    else if(this.typeofseat=="middle")
    {
        var n=this.noftickets*70;
    console.log("total payment is: "+n);
    }
    else
    {
        var n=this.noftickets*100;
    console.log("total payment is: "+n);
    }
}
}
var result=new Movie("saaho",2,"middle");
result.displayname();
result.displayNoOfTickets();
result.displaytypeofseat();
result.totalpayment();

console.log("\n");

var result1=new Movie("dearcomrade",6,"top");
result1.displayname();
result1.displayNoOfTickets();
result1.displaytypeofseat();
result1.totalpayment();

console.log("\n");

var result2=new Movie("RRR",8,"front");
result2.displayname();
result2.displayNoOfTickets();
result2.displaytypeofseat();
result2.totalpayment();