var a = 0;
var b = 0;
var c = 1;
var sum = 0;
var fibonacci = "";
for (var i = 0; i < 20; i++) {
    fibonacci += c + " ";
    sum += c;
    a = b;
    b = c;
    c = a + b;
}
console.log("Các số fibonacci là:  " + fibonacci);
console.log("Tổng các số fibonacci là  " + sum);
function sumFibonacci(number) {
    if (number == 1 || number == 2)
        return 1;
    return sumFibonacci(number - 1) + sumFibonacci(number - 2);
}
var sum1 = 0;
var fibonacci1 = "";
for (var i = 1; i <= 20; i++) {
    fibonacci1 += (sumFibonacci(i)) + " ";
    sum1 += sumFibonacci(i);
}
console.log("Các số fibonacci là:  " + fibonacci1);
console.log("Tổng các số fibonacci là  " + sum1);
