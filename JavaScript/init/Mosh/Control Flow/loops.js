// console.log('Hello World!')
// console.log('Hello World!')
// console.log('Hello World!')
// console.log('Hello World!')
// console.log('Hello World!')

//for
for (let i = 1; i <= 5; i++){
    console.log('Hello World', i);
}

//while
let i = 0;
while (i <= 5) {
    if (i % 2 == 0) {
        console.log(i);
    }
    i++;
}

//do-while
let j = 0;
do {
    if (j % 2 == 0) {
        console.log(j);
    }
    j++;
} while (j <= 5);

// for-in loop

let person = {
    name: 'John Doe',
    age: 30
};

for (let key in person) {
    console.log(key, person[key]);
}

const colors = ['red', 'green', 'blue'];

for (let index in colors) {
    console.log(index, colors[index]);
} //not ideal

for (let color of colors) {
    console.log(color)
}

//break and continue

for (let i = 0; i <= 10; i++){
    if (i === 5) {
        break;
    }
    console.log(i);
}

for (let i = 0; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;
    }
    console.log(i);
}
