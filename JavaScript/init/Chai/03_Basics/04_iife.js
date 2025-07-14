// Immediately Invoked Function Expression(IIFE)

(function connectDataBase() {
    //named IIFE
    console.log('DataBase Connected'); // IIFE function, used to avoid pollution from global scope
})();

((serverName) => {
    //unnamed IIFE
    console.log(`DataBase2 Connected to ${serverName}`);
})('Twitter');


console.log(0.1 + 0.2);

