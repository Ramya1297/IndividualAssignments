class Movie
{
public moviename:string;
public noftickets:number;
public typeofseat:string;
public payment:number;
constructor(moviename:string,noftickets:number,typeofseat:string){
this. moviename;
this.noftickets;
this.typeofseat;
}
displayname():string
{
return "movie name is: "+this.moviename;
}
displayNoOfTickets():string
{
    return "number of tickets are: "+this.noftickets;
}
displaytypeofseat(): string
{
    return "type of seat is: "+this.typeofseat;
}
totalpayment():string
{
    if(this.typeofseat=="front")
    {
    var n=this.noftickets*50;
    return "total payment is: "+n;
    }
    else if(this.typeofseat=="middle")
    {
        var n=this.noftickets*70;
    return "total payment is: "+n;
    }
    else
    {
        var n=this.noftickets*100;
        return "total payment is: "+n;
    }
}
}

var result=new Movie("saaho",2,"middle");
console.log(result.displayname());
console.log(result.displayNoOfTickets());
console.log(result.displaytypeofseat());
console.log(result.totalpayment());