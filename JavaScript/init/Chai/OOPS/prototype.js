let myHeroes = ['thor', 'spiderman'];

let heroPower = {
    thor: "Mjolnir",
    spiderman: "Web Shooters",

    getSpiderPower: function () {
        console.log(`Spidy power is ${this.spiderman}`);
    }
}

heroPower.getSpiderPower();

Object.prototype.archit = () => {
    console.log("Daddy's everywhere");
}

heroPower.archit();
myHeroes.archit();

Array.prototype.heyArchit = () => {
    console.log('Not everywhere');
}

myHeroes.heyArchit();
// heroPower.heyArchit();

// Inheritance

const User = {
    name: 'username',
    email: 'user@google.com'
}

const Teacher = {
    makeVideo: true
}

const teachingSupport = {
    isAvailable: false
}

const TAsupport = {
    makeAssignment: 'JS assignment',
    fullTime: true
    // __proto__: teachingSupport
}

Teacher.__proto__ = User;

// modern Syntax;
Object.setPrototypeOf(teachingSupport, Teacher)

Object.prototype.trueLength = function() {
    return this.trim().length;
}

const yoyo = 'yoyo         ';

console.log(yoyo.trueLength());





