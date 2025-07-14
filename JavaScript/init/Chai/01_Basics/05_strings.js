const name = 'archit';
const age = 50;

console.log(name + age + " Value"); // traditional way

console.log(`${name}${age} Value`); // modern/better way

let str = new String('abcdefg');
console.log(name);
console.log(str);
console.log(typeof str);

console.log(str.length);
console.log(str.charAt(0));
console.log(str.indexOf('a'));

console.log(str.substring(0,4));
console.log(str.slice(-6,4));

const newStr = '          absd.       ';
console.log(newStr);
console.log(newStr.trim());

const url = 'https://abcd.xyz/wiojfnwo%20jksfbjkew';
console.log(url.replace('%20', '-'));

console.log(url.includes('abcd'));

let candies = 'chocolate-toffee-shakes-fruits';
console.log(candies.split('-'));
