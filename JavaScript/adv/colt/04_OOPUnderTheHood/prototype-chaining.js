const grandParent = {
  greet() {
    return "Hello from grandParent!";
  }
}

const parent = {
  color: "red",
  getColor() {
    return this.color;
  },
  __proto__: grandParent,
};

const child = {
  color: "blue",
  __proto__: parent,
};

console.dir(child);
console.dir(Object.getPrototypeOf(child)); 

console.log(child.greet()); 