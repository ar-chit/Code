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

// class GuideDog extends Dog {
//   constructor(name, breed, owner) {
//     super(name, breed);
//     this.owner = owner;
//   }
//   alert() {
//     return `${this.name} alerts you to danger. Good dog!`;
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

function GuideDog(name, breed, owner) {
  Dog.call(this, name, breed); 
  this.owner = owner;
}

GuideDog.prototype = Object.create(Dog.prototype);
GuideDog.prototype.constructor = GuideDog;

GuideDog.prototype.alert = function () {
  return `${this.name} alerts you to danger. Good dog!`;
};


const Buddy = new GuideDog("Buddy", "Golden Retriever", "Alice");