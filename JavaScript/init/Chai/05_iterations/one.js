// for
for (let index = 0; index <= 10; index++) {
    const element = index;
    if (element == 5) {
        console.log('5 is the best number');
    }
    console.log(element);
    
}

for (let i = 0; i <= 10; i++){
    // console.log(`value of outer loop ${i}`);
    for (let j = 0; j <= 10; j++){
        // console.log(`value of inner value is ${j} and outer value is ${i}`);
        console.log(`${i} * ${j} = ${i * j}`);
    }
}

let myArray = ['flash', 'batman', 'superman'];

for (let i = 0; i < myArray.length; i++) {
    const element = myArray[i];
    console.log(element);   
}

for (let i = 1; i <= 20; i++){
    if (i === 5) {
        console.log('Detected 5');
        break;
    }
    console.log(`value of i is ${i}`);
}

for (let i = 1; i <= 20; i++) {
    if (i === 5) {
        console.log('Detected 5');
        continue;
    }
    console.log(`value of i is ${i}`);
}