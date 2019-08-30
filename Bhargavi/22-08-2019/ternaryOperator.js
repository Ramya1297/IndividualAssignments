function ternary(child) {
    return (child ? "$5.00" : "$10.00");
}
console.log(ternary(true));
console.log(ternary(false));
console.log(ternary(1));
console.log(ternary(0));
