class User{
    constructor(username, email, password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    encryptPassword() {
        return `Encrypted ${this.password}`;
    }

    capitalizeUsername() {
        return this.username.toUpperCase();
    }
}

const user1 = new User("user", 'user@google.com', '123');
console.log(user1.capitalizeUsername());
console.log(user1.encryptPassword());

// behind the scene

function UserFn(username, email, password) {
    this.username = username;
    this.email = email;
    this.password = password;
}

UserFn.prototype.encryptPassword = function () {
    return `Encrypted ${this.password}`;
}

UserFn.prototype.capitalizeUsername = function () {
    return this.username.toUpperCase();
}

const user2 = new UserFn('user', 'email@google.com', 'pass@word');
console.log(user2.capitalizeUsername());
console.log(user2.encryptPassword());
