var name = "Archit Sehgal";
var age = "20";

var users = [ "Archiit", "Billa", "Kukkad"];

var user1 = "Archit";
var age1 = 20;

var user2 = "SpongeBob";
var age2 = 30;

var users_and_age = ["Archit", 20, "Optimus", 69, "Shinchan", 5];

var user69 = {
    name: "Billa",
    age: 2,
    phone: 696969
}

console.log(users);

console.log(users[0]);

for (var i = 0; i < users.length; i++) {
    console.log(users[i]);
} 

var newUsers = [
    { name: "Archit", age: 22 },
    { name: "Kukkad", age: 4 },
    { name: "Billa", age: 5 }
];

for (var i = 0; i < newUsers.length; i++){
    console.log(newUsers[i].name + "'s age is " + newUsers[i].age);
}



