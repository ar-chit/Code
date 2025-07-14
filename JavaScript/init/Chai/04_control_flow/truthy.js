const userEmail = 'a@gmail.com';

if (userEmail) {
    console.log('got user email');
} else {
    console.log("don't have user email");
}

// falsy values
// false, 0, -0, BigInt: 0n, '', null, undefined, NaN

// truthy
// "0" 'false', ' ',[], {}, function(){}

const arr = [];

if (arr.length === 0) {
    console.log('Array is empty');
}

const obj = {};

if (Object.keys(obj).length === 0) {
    console.log('The object is empty');
}

// Nullish Coalescing Operator (??): null undefined

let val1 = null ?? 69;      //used to handle errors
console.log(val1);

// condition ? true : false;    // ternary operator

const iceTeaPrice = 100;
iceTeaPrice >= 80 ? console.log('less than 80') : console.log('more than 80');

