const marvel_heroes = ['thor', 'ironman', 'hulk'];
const dc_heroes = ['superman', 'batman', 'flash'];

// marvel_heroes.push(dc_heroes);

// console.log(marvel_heroes);

// console.log(marvel_heroes[3][0]);

const allHeroes = marvel_heroes.concat(dc_heroes);
console.log(allHeroes);

const allNewHeroes = [...marvel_heroes, ...dc_heroes]; //yet an another way to concat(just spread it)
console.log(allNewHeroes);

const anotherArray = [1, 2, 3, [4, 5, 6], 7, [6, 7, [4, 5]]];
const usableAnotherArray = anotherArray.flat(2); // flattens the array and depth has to be mentioned, if not in mood to mention, just write infinity
console.log(usableAnotherArray);

console.log(Array.isArray('abcd'));
console.log(Array.from('abcd'));
console.log(Array.from({ name: 'abcd' })); // interesting case

let score1 = 200;
let score2 = 300;
let score3 = 400;


console.log(Array.of(score1, score2, score3));


