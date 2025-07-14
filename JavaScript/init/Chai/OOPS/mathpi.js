const descriptor = Object.getOwnPropertyDescriptor(Math, 'PI');

console.log(descriptor);

const user = {
    name: 'Googler',
    totalLogins: 250,
    isAvailable: true
}

console.log(Object.getOwnPropertyDescriptor(user, 'name'));

Object.defineProperty(user, 'name', {
    writable: false,
    enumerable: false,
    configurable: false
})

user.name = 'Youtuber';

console.log(user.name);

console.log(Object.getOwnPropertyDescriptor(user, 'name'));

for (let [key,value] of Object.entries(user)) {
    console.log(key, value);
}
