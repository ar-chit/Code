function getRandomNumber(min, max) {
    return Math.floor(min + Math.random() * (max - min + 1));
}


function getRandomNumber(max) {
    return Math.floor(Math.random() * (max + 1));
}

console.log(getRandomNumber(0,2));
