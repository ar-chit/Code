const user = {
    _name: 'John Doe',
    _email: 'johndoe@googl.com',

    get email() {
        return this._email.toLowerCase();
    },

    set email(email) {
        this._email = email;
    }
}

const Archit = Object.create(user);
console.log(Archit.email);