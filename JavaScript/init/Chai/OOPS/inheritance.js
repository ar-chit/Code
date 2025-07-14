class User{
    constructor(username) {
        this.username = username;
    }

    logMe() {
        console.log(`${this.username} is currently logged in`);
    }
}

class Teacher extends User{
    constructor(username, email, password) {
        super(username);
        this.email = email;
        this.password = password;
    }

    addCourse() {
        console.log(`A new course has been added by ${this.username}`);
    }
}

const teacher1 = new Teacher('teacher', 'teacher@gmail.com', 'pass@word');
console.log(teacher1.addCourse()); 

teacher1.logMe();

const user1 = new User('user');

user1.logMe();

console.log(teacher1 instanceof User);
console.log(teacher1 instanceof Teacher);
console.log(user1 instanceof User);
console.log(user1 instanceof Teacher);
// console.log(User instanceof Teacher);
// console.log(Teacher instanceof User);


