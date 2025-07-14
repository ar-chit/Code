// Primitive

// 7 types: String, Number, Boolean, null, undefined, Symbol, BigInt
const score = 100;
const scoreValue = 100.3;

const isLogged = false;
const outsideTemp = null;
let userEmail;

const id = Symbol('123');
const anotherId = Symbol('123');

console.log(id == anotherId);

const bigNumber = 24834024029502390394024n;


//Reference type (Non-primitive)

// Arrays, Objects, Functions
const numbers = [1, 2, 3];
let myObj = {
    name: 'Archit',
    age: 19 
};

const myFunction = function () {
    console.log("Hello World");
}

console.log(typeof numbers);

// Stack => Primitive, Heap => Non-primitive

let name1 = 'google';
let name2 = name1;

name2 = 'facebook';

console.log(name1);
console.log(name2);

let user1 = {
    email: 'user@google.com',
    upi: 'user@ybl'
}

let user2 = user1;
user2.email = "newUser@gmail.com";

console.log(user1.email);
console.log(user2.email);

let arr = [1, 2, 3, 4, 5];
let brr = arr;

brr[0] = 56;
console.log(arr[0]);