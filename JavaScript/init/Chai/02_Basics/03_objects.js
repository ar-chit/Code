// singleton
// Object.create
// object literals

const sym = Symbol('key');

const jsUser = {
    'Full Name': 'Archit',
    age: 20,
    [sym]: 'myKey1',
    location: 'Delhi',
    email: 'archit@gmail.com',
    isLoggedIn: false,
    lastLoginDays: ['Monday', 'Saturday']
};

console.log(jsUser["Full Name"]);
console.log(jsUser[sym]);

jsUser['email'] = 'google@chatgpt.com';
jsUser['password'] = '122345';

console.log(jsUser);
delete jsUser.age;

// Object.freeze(jsUser);
jsUser['email'] = 'chatgpt@google.com';
console.log(jsUser);

jsUser.greetings = function () {
    console.log(`Hello ${this["Full Name"]}`);
}

console.log(jsUser.greetings());
