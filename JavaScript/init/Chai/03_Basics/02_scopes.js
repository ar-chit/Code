let a = 10;
const b = 20;
var c = 30;

if (true) {
    let a = 10;
    const b = 20;
    var c = 300;
}

console.log(a);
console.log(b);
console.log(c);

function one() {
    const username = 'Archit';
    function two() {
        const website = 'reddit';
        console.log(username);
    }
    // console.log(website);
    two();
}

one();
// two();

if (true) {
    const username = 'Archit';
    if (username === 'Archit') {
        const website = 'reddit';
        console.log(`${username} ${website}`);
    }
    // console.log(website);
}
// console.log(username);


// I need to know this // Interesting // Important

function addNum1(num1) {
    return num1 + 1;
}

console.log(addNum1(5));
// console.log(addNum2(5)); // expressions are treated as variables

const addNum2 = function (num1) {
    return num1 + 1;
} // expression

console.log(addNum2(5));

