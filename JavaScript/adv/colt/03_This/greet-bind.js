function greet() {
    console.log(`${this.firstName} says hello!`);
}

const john = {
    firstName: "John",
    greet: () => {
        console.log("THIS is: ", this);
        
        console.log(`${this.firstName} says hello!`);
    }
};

john.greet(); 