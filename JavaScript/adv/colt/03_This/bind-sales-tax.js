"use strict";

function applySalesTax(taxRate, price) {
  console.log("this is", this);
  return price + price * taxRate;
}

const applyCASalesTax = applySalesTax.bind(globalThis, 0.075);
const applyNYCSalesTax = applySalesTax.bind(null, 0.08875);

function multiply(a, b) {
  return a * b;
}

const double = multiply.bind(null, 2);
const triple = multiply.bind(null, 3);

console.log(applyCASalesTax(100));
// console.log(applyNYCSalesTax(100));
console.log(double(5));

const applyCASalesTaxFor100 = applyCASalesTax.bind(null, 100);
console.log(applyCASalesTaxFor100());
