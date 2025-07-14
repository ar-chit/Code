// If a customer has more than 100 ProcessingInstruction,
// he's a gold customer, else he's a silver customer

let points = 100;
let type = points > 100 ? 'gold' : 'silver';
console.log('Customer is ' + type + ' customer');