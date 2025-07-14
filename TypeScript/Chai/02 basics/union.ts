let score: number | string = 33;

score = "55";

type User = {
  readonly _id: Object;
  name: string;
  email: string;
  isActive: boolean;
  creditCard?: number;
};

type Admin = {
  readonly _id: Object;
  name: string;
  email: string;
  isActive: boolean;
  role: string;
};

let Archit: User | Admin = {
  _id: 1,
  name: "Archit",
  email: "a@a.com",
  isActive: true,
  role: "admin",
};

function getDbId(id: number | string): string | number {
  return typeof id === "string" ? id.toLowerCase() : id++;
}

getDbId(3);

getDbId("3");

const numData: number[] = [1, 2, 3, 4, 5];
const strData: string[] = ["1", "2", "3", "4", "5"];

const unionData: (string | number | boolean)[] = [1, "2", 3, "4", "5", true];

//  strict

let pi: 3.14 = 3.14;

type seatAllotment = "aisle" | "middle" | "window";
