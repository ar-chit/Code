const myNums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

// let fibonacci = myNums.reduce((acc, curr) => {
//     console.log(acc, curr);
//     return acc + curr
// }, 0);

let fibonacci = myNums.reduce((acc, curr) => acc + curr, 0);
console.log(fibonacci);

const shoppingCart = [
    {
        itemName: 'js course',
        price: 2999
    },
    {
        itemName: 'py course',
        price: 999
    },
    {
        itemName: 'mobile dev',
        price: 5999
    },
    {
        itemName: 'data science course',
        price: 12999
    }
];

const totalCartPrice = shoppingCart.reduce((acc, itemPrice) => acc + itemPrice.price, 0);

console.log(totalCartPrice);