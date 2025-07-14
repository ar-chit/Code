type Combinable = string | number;

function add(a: Combinable): number;
function add(a: number, b: number): number;
function add(a: string, b: string): string;
function add(a: string, b: number): string;
function add(a: number, b: string): string;
function add(a: Combinable, b?: Combinable) {
  if (!b) {
    return a;
  }
  if (typeof a === "string" || typeof b === "string") {
    return a.toString() + b.toString();
  }

  return a + b;
}

const result = add("5", " 5");
console.log(result.split(" ")); 

const fetchedUser = {
  id: "u1",
  name: "Archit",
  job: { title: "CEO", description: "My own company" },
}

console.log(fetchedUser?.job?.title);

const userInput = "";

const storedData = userInput ?? "DEFAULT";

console.log(storedData);

