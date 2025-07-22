const Conan = {
    name: "Conan",
    city: "Log Angeles",
    sing() {
        console.log("this is", this);
        console.log(`${this.name} is singing La la la`);
    },
    greet(greeting, punctuation) {
        console.log(`${this.name} says ${greeting} from ${this.city}${punctuation}`);
    }
}

const Lisa = {
  name: "Lisa",
  city: "Log Angeles",
  sing() {
    console.log("this is", this);
    console.log(`${this.name} is singing La la la`);
  },
};

Conan.greet.call(Lisa, "hi", "!!!");
Conan.greet.apply(Lisa, ["hi", "!!!"]);

const LisaGreets = Conan.greet.bind(Lisa);
LisaGreets("hello", "!!!");

function maximum() { 
    console.log(arguments);
    return Math.max.apply(null, arguments);
}

const max = maximum(1, 2, 3, 4, 5);
console.log("Max is:", max);