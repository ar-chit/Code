//max of 2 numbers
function max(a, b) {
    return a < b ? b : a;
}

console.log(max(3, 3));

// are the dimensions landscape?
function isLandscape(width, height) {
    return width > height;
}

console.log(isLandscape(800, 300));

//FizzBuzz
function fizzBuzz(input) {
    if (typeof input !== 'number') {
        return 'Not a number';
    } else if (input % 3 === 0 && input % 5 === 0) {
        return "FizzBuzz";
    } else if (input % 3 === 0) {
        return "Fizz";
    } else if (input % 5 === 0) {
        return "Buzz";
    } else {
        return input;
    }
}

console.log(fizzBuzz(NaN));

// Driver's Licence
function speedCheck(speed) {
    const speedLimit = 70;

    if (speed <= speedLimit) {
        console.log('Ok');
    } else {
        let points = Math.floor((speed - speedLimit) / 5);
        if (points === 0) {
            console.log('Ok');
        } else if (points < 12) {
            console.log('You have ' + points + ' points');
        } else {
            console.log("Your license has been suspended");
        }
    }
}

speedCheck(75);

//Even and Odd
function evenAndOdd(number) {
    for (let i = 0; i <= number; i++) {
        let ans = i % 2 == 0 ? i + ' EVEN' : i + ' ODD';
        console.log(ans);
    }
}

evenAndOdd(10);

//countTruthy
function countTruthy(array) {
    let counter = 0;
    for (let value of array) {
        if (value) {
            counter++;
        }
    }
    return counter;
}

arr = [0, NaN, 69, 1, 2, 3];
console.log(countTruthy(arr));

// String Properties
function showProperties(obj) {
    for (let key in obj) {
        if (typeof obj[key] === 'string') {
            console.log(key, obj[key]);
        }
    }
}
const person = {
    name: "John",
    age: 24,
    country: "USA"
}
showProperties(person);

//Sum of multiples of 3 and 5
function sum(limit) {
    let total = 0;
    for (let i = 1; i <= limit; i++){
        if (i % 3 === 0 || i % 5 === 0) { 
            total += i;
        }
    }
    return total;
}

console.log(sum(10));

//Grade
function calculateGrades(marks) {
    let avg = average(marks);
    if (avg >= 1 && avg <= 59) {
        return 'F';
    } else if (avg >= 60 && avg <= 69) {
        return 'D';
    } else if (avg >= 70 && avg <= 79) {
        return 'C';
    } else if (avg >= 80 && avg <= 89) {
        return 'B';
    } else if (avg >= 90 && avg <= 100) {
        return 'A';
    } else {
        return '-1';
    }
}

function average(input) {
    let sum = 0;
    for (elements of input) {
        sum += elements;
    }
    return sum / input.length;
}

console.log(calculateGrades([150, 70, 80, 90]));

//Stars
function printStarPattern(rows) { 
    for (let i = 0; i < rows; i++){
        let pattern = '';
        for (let j = 0; j < i + 1; j++){
            pattern += '*';
        }
        console.log(pattern);
    }
}

printStarPattern(5)

//Prime
function isPrimeNumber(num) { 
    for (let i = 2; i * i <= num; i++) { 
        if (num % i == 0) { 
            return false;
        }
    }
    return num > 1;
}

function showPrimes(limit) {
    for (let i = 2; i <= limit; i++){
        if (isPrimeNumber(i)) { 
            console.log(i);
        }
    }
}

showPrimes(20);