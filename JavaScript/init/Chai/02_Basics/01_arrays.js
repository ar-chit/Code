const myArr = [0, 1, 2, 3, 4, 5];
const myHeroes = ['joker', 'batman', 'superman'];

console.log(myArr);
console.log(myArr[1]);
console.log(myArr.length);

const myArr2 = new Array(1, 2, 3, 4, 5);
console.log(myArr2);

myArr.push(6); // adds at the end
myArr.push(7);
myArr.pop(); // removes from end

myArr.unshift(9); //adds at start
myArr.shift(); // removes from start

console.log(myArr.includes(9));
console.log(myArr.indexOf(1));

console.log(myArr);

const newArr = myArr.join();
console.log(newArr);

//slice and splice

console.log(myArr.slice(1, 3)); // last element is not included
console.log(myArr);
console.log(myArr.splice(1, 3)); // last element is included, and the array is also manipulated
console.log(myArr);