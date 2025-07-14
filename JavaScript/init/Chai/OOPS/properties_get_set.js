function User(email, password) {
    this._email = email;
    this._password = password;

    Object.defineProperty(this, 'email', {
        get: function () {
            return this._email.toLowerCase();
        },
        set: function (email) {
            this._email = email;
        }
    });
}

const user1 = new User('JohnDoe@example.com', 'myPassword');
console.log(user1.email);
