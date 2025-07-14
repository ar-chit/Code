function printAllUsers(users) {
    for (var i = 0; i < users.length; i++){
        const toLog = users[i].name + "'s age is " + users[i].age;
        console.log(toLog);
    }
}

var users = [
    { name: "Archit", age: 20 },
    { name: "Billa", age: 5 }
]

printAllUsers(users);
printAllUsers(users);
printAllUsers(users);
printAllUsers(users);
printAllUsers(users);
printAllUsers(users);
printAllUsers(users);
