const myObj = {
  name: "Colt",
  age: 100,
  isInstructor: true,
  friends: ["Blue", "Rufus", "Luna"],
};

// class Dog {
//   constructor(name, breed) {
//     this.name = name;
//     this.breed = breed;
//   }
//   bark() {
//     return `${this.name} says woof!`;
//   }
//   sleep() {
//     return `${this.name} is sleeping!`;
//   }
// }

function Dog(name, breed) {
  this.name = name;
  this.breed = breed;
}

Dog.prototype.bark = function () {
  return `${this.name} says woof!`;
};

Dog.prototype.sleep = function () {
    return `${this.name} is sleeping!`;
  };

const myDog = new Dog("Buddy", "Golden Retriever");

console.log("Prototype of myObj:");
console.dir(Object.getPrototypeOf(myObj), { showHidden: true, depth: 1 });

console.log("Prototype of myDog:");
console.dir(Object.getPrototypeOf(myDog), { showHidden: true, depth: 1 });

console.log("Dog class methods:");
console.log(Object.getOwnPropertyNames(Dog.prototype)); // ['constructor', 'bark', 'sleep']
