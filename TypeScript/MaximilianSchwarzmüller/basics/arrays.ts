const person: {
  name: string;
  age: number;
  hobbies: string[];
  role: [number, string];
} = {
  name: "Archit",
  age: 21,
  hobbies: ["Sports", "Cooking"],
  role: [2, "author"],
};

person.role.pop();

console.log(person.role);


let favoriteActivities: string[];

favoriteActivities = ["Sports"];

for (const hobby of person.hobbies) {
  console.log(hobby.toLowerCase());
  // console.log(hobby.map);  ERROR
}
