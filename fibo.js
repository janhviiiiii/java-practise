
var a = 0;
var b = 1;

console.log(a, " ", b, " ");


for(let i=1; i< 10 ; i++){
    const temp = b;
    b = a + b;
    a = temp;
    console.log(b , " ");
}
