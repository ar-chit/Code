const promiseOne = new Promise((resolve, reject) => {
    // Do an async task
    // DB calls, cryptography, network
    setTimeout(() => {
        console.log('Async Task 1 completed');
        resolve();
    }, 1000)
});

promiseOne.then(() => console.log('Promise 1 consumed'));

new Promise((resolve, reject) => {
    setTimeout(() => {
        console.log('Async Task 2 completed');
        resolve();
    }, 2000)
}).then(() => console.log('Promise 2 consumed'))

new Promise((resolve, reject) => {
    setTimeout(() => resolve({
        username: 'Archit',
        email: 'archit@google.com'
    }), 1000);
}).then((user) => console.log(user));

new Promise((resolve, reject) => {
    setTimeout(() => {
        let error = true;
        if (!error) {
            resolve({
                username: 'Elon Musk',
                password: '123'
            });
        } else {
            reject("Invalid Credentials");
        }
    })
}).then((user) => {
    console.log(user);
    return user.username;
}).then((username) => console.log(username))
.catch((error) => console.log(error))
.finally(() => console.log('The promise is either resolved or rejected'));


const promiseFive = new Promise((resolve, reject) => {
    setTimeout(() => {
        let error = true;
        if (!error) {
            resolve({
                username: 'Elon Musk',
                password: '123'
            });
        } else {
            reject("Invalid Credentials");
        }
    });
});

(async function consumePromiseFive() {
    try {
        const response = await promiseFive;
        console.log(response);
    } catch (error) {
        console.log(error);
    }
})();

(async function getAllUsers() {
    try {
        const users = await fetch('https://jsonplaceholder.typicode.com/users');
        const data = await users.json();
        console.log(data);
    } catch (error) {
        console.log(error);
    }
})();

fetch('https://jsonplaceholder.typicode.com/users')
    .then((response) => response.json())
    .then((data) => console.log(data))
    .catch((error)=>console.log(error))