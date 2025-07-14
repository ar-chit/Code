const user = {
    username: "Archit",
    loginCount: 8,
    signedIn: true,

    getUserDetails: function () {
        console.log(`username: ${this.username}`);
    }
}

// const promiseOne = new Promise();
// let date = new Date();

function User(username, loginCount, isLoggenIn) {
    this.username = username;
    this.loginCount = loginCount;
    this.isLoggenIn = isLoggenIn;

    this.greetings = function(){
        console.log(`Welcome ${username}`);
    }

    // return this;
}

// const user1 = User('Archit', 12, true);
// const user2 = User('Sehgal', 42, false);

// console.log(user1);

const user1 = new User('Archit', 12, true);
const user2 = new User('Sehgal', 42, false);

console.log(user1);
console.log(user2);

console.log(user1.greetings());

console.log(user1.constructor);

