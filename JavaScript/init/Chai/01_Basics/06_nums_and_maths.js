const score = 400;
console.log(score);

const balance = new Number(100);
console.log(balance);

console.log(balance.toString().length);
console.log(balance.toFixed(2));

const otherNumber = 23.8366;
console.log(otherNumber.toPrecision(3));

const hunderds = 1000000;
console.log(hunderds.toLocaleString('en-In'));


//Math section

console.log(Math);
console.log(Math.abs(-4));
console.log(Math.round(4.6));
console.log(Math.ceil(4.1));
console.log(Math.floor(4.9));
console.log(Math.min(4, 7, 2, 8));
console.log(Math.max(4, 7, 2, 8));
console.log(Math.random());
console.log(Math.floor((Math.random() * 10) + 1));

let max = 20;
let min = 10;
let randomNum = Math.floor(Math.random() * (max - min)) + min;
console.log(randomNum);

