class Cat {
  constructor(firstName) {
    this.firstName = firstName;
  }

  static getRandomCat() {
    console.log("getRandomCat called", this);   
  }

  dance(style = "tango") {
    console.log("THis is: ", this);
    console.log(`${this.firstName} is dancing ${style}`);
  }
}

const kitty = new Cat("Kitty");
const kittyDance = kitty.dance;
kittyDance.call(kitty, "salsa")
