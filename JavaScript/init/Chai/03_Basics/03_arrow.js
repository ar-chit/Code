const user = {
    username: 'Archit',
    age: 20,
    welcomeMessage: function () {
        console.log(`Welcome ${this.username}! You are ${this.age} years old.`);
        console.log(this);
    }
};

user.welcomeMessage(); 
user.username = 'Sam';
user.welcomeMessage(); 

console.log(this);

function daddy() {
    console.log(this);
}

daddy();

function hi() {
    let username = 'Archit';
    console.log(this.username);
}

hi();

const hello = function(){
    let username = 'Archit';
    console.log(this);
}

hello();

const sum1 = (num1, num2) => {
    return num1 + num2;
}

const sum2 = (num1, num2) => num1 + num2;
const sum3 = (num1, num2) => (num1 + num2);

console.log(sum3(5, 6));

const hey1 = () => ({ username: 'Archit' });
console.log(hey1());