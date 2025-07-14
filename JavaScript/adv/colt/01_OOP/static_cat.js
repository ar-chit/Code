class Cat {
  constructor(name, breed) {
    this.name = name;
    this.breed = breed;
  }

  meow() {
    console.log("THIS IS: ", this);
  }

  static staticMeow() {
    console.log("THIS IS: ", this);
  }

  static species = "felis catus";
}

Cat.species = "domestic cat";

const kitty = new Cat("Whiskers", "Siamese");
kitty.meow(); 

Cat.staticMeow();
