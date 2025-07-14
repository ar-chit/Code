const user = new Object();

user.id = '123abc';
user.name = 'Sam';
user.isLoggedIn = false;

console.log(user);

const regularUser = {
    email: 'some@gmail.com', 
    fullName: {
        userFullName: {
            firstName: 'Archit',
            lastName: 'Sehgal'
        }
    }
}

console.log(regularUser.fullName.userFullName.firstName);

const obj1 = {
    1: 'a',
    2: 'b'
};

const obj2 = {
    3: 'a',
    4: 'b'
};

const obj3 = { obj1, obj2 };
console.log(obj3); // Gives the array inside array issue

const obj4 = Object.assign({}, obj1, obj2);
console.log(obj4);

const obj5 = { ...obj1, ...obj2 }; // Spread ittttt
console.log(obj5);

console.log(Object.keys(user));
console.log(Object.values(user));
console.log(Object.entries(user));

console.log(user.hasOwnProperty('isLoggedIn')); // tells if a key exists or not?

const course = {
    courseName: 'learn js',
    price: '699',
    courseInstructor: 'Billa'
};

const { courseInstructor: instructor } = course;

console.log(instructor);

// {
//     "name" : "Archit",
//     "courseName": "js",
//     "price": "free"
// }   json format 
