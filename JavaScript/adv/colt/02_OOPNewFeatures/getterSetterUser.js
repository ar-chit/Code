class User {
  constructor(firstName, lastName) {
    this._firstName = firstName;
    this._lastName = lastName;
  }

  get firstName() {
    return this._firstName;
  }

  get lastName() {
    return this._lastName;
  }

  get fullName() {
    return `${this._firstName} ${this._lastName}`;
  }

  set firstName(name) {
    if (name && typeof name === "string" && name.trim() !== "") {
      this._firstName = name;
    }
  }

  set lastName(name) {
    if (name && typeof name === "string" && name.trim() !== "") {
      this._lastName = name;
    }
  }
  set fullName(name) {
    if (name && typeof name === "string" && name.trim() !== "") {
      const [firstName, lastName] = name.split(" ");
      if (firstName && lastName) {
        this._firstName = firstName;
        this._lastName = lastName;
      }
    }
  }
}
