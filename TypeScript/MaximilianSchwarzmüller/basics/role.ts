enum Role { ADMIN, READ_ONLY, AUTHOR };

const person = {
  name: "Archit",
  age: 21,
  hobbies: ["Sports", "Cooking"],
  role: Role.ADMIN,
};

console.log(person.role);

