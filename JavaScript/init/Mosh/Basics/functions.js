function greet(firstName, lastName) {
    console.log('Hello ' + firstName + ' ' + lastName);
}

greet('Tony', 'Stark');
greet('John'); //by default value is undefined

function square(number) {
    return number * number;
}

let number = square(2);
console.log(number);

console.log(square(4));