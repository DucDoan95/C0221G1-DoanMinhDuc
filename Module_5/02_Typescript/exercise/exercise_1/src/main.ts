let a: number = 0;
let b: number = 0;
let c: number = 1
let sum: number = 0;
let fibonacci ="";
for (let i = 0; i < 20; i++) {
    fibonacci += c +" ";
    sum +=c;
    a = b;
    b = c;
    c = a + b;
}
console.log("Các số fibonacci là:  "+fibonacci);
console.log("Tổng các số fibonacci là  "+sum);
function sumFibonacci(number: number):number {
    if (number == 1 || number == 2)
        return 1;
    return  sumFibonacci(number - 1) + sumFibonacci(number - 2);
}
let sum1:number =0;
let fibonacci1 ="";
for (let i=1;i<=20;i++){
    fibonacci1+=(sumFibonacci(i))+" "
    sum1+=sumFibonacci(i);
}
 console.log("Các số fibonacci là:  "+fibonacci1);

 console.log("Tổng các số fibonacci là  "+sum1);

