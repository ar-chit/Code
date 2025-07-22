const person = {
  name: "Alice",
  age: 30,
  greet: function () {
    return `Hello, my name is ${this.name} and I am ${this.age} years old.`;
  },
};

const tom = Object.create(person);

console.log(tom);

console.log(Object.getPrototypeOf(tom));

console.log(person.isPrototypeOf(tom));

Object.setPrototypeOf(tom, {
  name: "Tom",
  age: 25,
  greet: function () {
    return `Hi, I'm ${this.name} and I'm ${this.age} years old.`;
  },
});

console.log(person.isPrototypeOf(tom));

console.log(Object.getPrototypeOf(tom));
