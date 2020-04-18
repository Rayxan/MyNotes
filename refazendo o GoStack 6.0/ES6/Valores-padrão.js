function soma(a=3,b=6){
    return a+b;
}
console.log("sem arrow funct = " + soma(1));
console.log("sem arrow funct = " + soma());
//-----------------------------------------------------------
const soma2  = (a=3,b=6) => a+b;
console.log("\ncom arrow funct = " + soma2(1));
console.log("com arrow funct = " + soma2());
