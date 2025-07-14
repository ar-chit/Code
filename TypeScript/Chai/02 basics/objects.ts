const user = {
  name: "user",
  email: "user@gmail.com",
  isActive: true,
};

function createUser(user: User) {}

// createUser(userObj);

function createCourse(): { name: string; price: number } {
  return { name: "reactJs", price: 399 };
}

type User = {
  readonly _id: Object;
  name: string;
  email: string;
  isActive: boolean;
  creditCard?: number;
};

const userObj: User = {
  _id: { id: "1234" },
  name: "user",
  isActive: false,
  email: "something@something.com",
};

console.log(userObj);
