function sayMyName() {
    console.log('A');
    console.log('R');
    console.log('C');
    console.log('H');
    console.log('I');
    console.log('T');
}
 
function addTwoNumbers(num1, num2){  //num1, num2 => parameters
    console.log(num1 + num2);
}

addTwoNumbers(3, 4); // 3,4 => arguments
const result = addTwoNumbers(3, 4);
console.log(result); // we need to return

function addTwoNumbers2(num1, num2){
    return num1 + num2;
}

const result2 = addTwoNumbers2(3, 4);
console.log(result2);

function loginUserMessage(username) {
    if (!username) {
        console.log("Username is required");
        return;
    }
    return `${username} just logged in`;
}

console.log(loginUserMessage('Archit'));
console.log(loginUserMessage());

function calculateCartPrice1(...num1) {
    return num1;
}

console.log(calculateCartPrice1(200));
console.log(calculateCartPrice1(200, 300, 400));

function calculateCartPrice2(val1, val2, ...num1) {
    return num1;
}

console.log(calculateCartPrice2(200, 300, 400, 500, 2000));

const user = {
    name: 'Arpit',
    age: 26
}

function handleObject(object) {
    console.log(`Username is ${object.name}, and age is ${object.age}`);
}

handleObject(user);
handleObject({
    name: 'Archit',
    age: 29
})

const myArray = [200, 400, 600, 800];

function getSecondValue(getArray) {
    return getArray[1];
}

console.log(getSecondValue(myArray));