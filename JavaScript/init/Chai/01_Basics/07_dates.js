let myDate = new Date();
console.log(myDate);
console.log(myDate.toString());
console.log(myDate.toLocaleString());

let myCreatedDate = new Date('2019-08-12 ');
console.log(myCreatedDate.toString());

let myTimeStamp = Date.now();
console.log(myTimeStamp);
console.log(myCreatedDate.getTime());
console.log(Math.floor(Date.now() / 1000));

let newDate = new Date();
console.log(newDate.getFullYear());

console.log(newDate.toLocaleString('default', {
    weekday: "narrow",
    year: "numeric"
}));
