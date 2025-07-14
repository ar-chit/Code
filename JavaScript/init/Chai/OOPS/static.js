class User{
    constructor(username) { 
        this.username = username;
    }

    logMe() {
        console.log(`${this.username} is currently logged in`);
    }

    static createId() {
        return `User ID: ${Math.random().toString(36).substr(2, 9)}`;
    }
}


const user = new User('archit');
// console.log(user.createId());

class Teacher extends User{
    constructor(username, email) {
        super(username);
        this.email = email;
    }
}

const teacher = new Teacher('teacher', 'teacher@google.com');
teacher.logMe();
// console.log(teacher.createId());