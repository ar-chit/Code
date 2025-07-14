const accountId = 144553;
let accountEmail = 'daddy@gmail.com';
var accountPassword = "12345"; //prefer not to use var because of issue in block scope and functional scope 
accountCity = 'Bombay';
let accountState;
// accountId = 2; //not allowed

console.log(accountId);
accountEmail = 'sc@gmail.com';
accountPassword = '1212121';
accountCity = 'Delhi';

console.log(accountId);


console.table([accountId, accountEmail, accountPassword, accountCity, accountState]);