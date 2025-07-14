const myObject = {
    js: 'JavaScript',
    CPP: 'C++',
    Rb: 'Ruby',
    Swift: 'Swift by Apple'
};

for (const key in myObject) {
    console.log(`${key} is shortcut for ${myObject[key]}`);
}

const arr = ['js', 'rb', 'py', 'java', 'cpp'];

for (const index in arr) {
    console.log(arr[index]);
}