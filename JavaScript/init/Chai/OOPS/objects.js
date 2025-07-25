function multiplyWith5(num) {
    return num * 5;
}

multiplyWith5.power = 9;

console.log(multiplyWith5(5));
console.log(multiplyWith5.power);
console.log(multiplyWith5.prototype);

function pricing(item, price) {
    this.item = item;
    this.price = price;
}

pricing.prototype.increment = function () {
    this.price++;
    return this.price;
}

pricing.prototype.printMe = function () {
    console.log(`Price is ${this.price}`);
}

const item1 = new pricing('pao', 25);
console.log(item1.increment());
item1.printMe();

/*

Here's what happens behind the scenes when the new keyword is used:

A new object is created: The new keyword initiates the creation of a new JavaScript object.

A prototype is linked: The newly created object gets linked to the prototype property of the 
constructor function. This means that it has access to properties and methods defined on the 
constructor's prototype.

The constructor is called: The constructor function is called with the specified arguments and
this is bound to the newly created object. If no explicit return value is specified from the 
constructor, JavaScript assumes this, the newly created object, to be the intended return value.

The new object is returned: After the constructor function has been called, if it doesn't 
return a non-primitive value (object, array, function, etc.), the newly created object is 
returned.

*/