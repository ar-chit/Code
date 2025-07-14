class User{
    constructor(email, password) {
        this.email = email;
        this.password = password;
    }

    get email() {
        return this._email.toLowerCase();
    }

    set email(email) {
        this._email = email;
    }

    get password() {
        return this._password.toUpperCase();
    }

    set password(password) {
        this._password = password;
    }
}

const Archit = new User('archit@google.ai', 'abc');
console.log(Archit.password);