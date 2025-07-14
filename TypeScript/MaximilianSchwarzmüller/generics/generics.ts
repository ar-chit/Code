const names: Array<string> = [];
names[0] = "Hello";
console.log(names);

const promise: Promise<string> = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("This is done");
  }, 2000);
});

promise.then((data) => {
  console.log(data.split(" "));
});

function mergeObj<T extends object, U extends object>(objA: T, objB: U) {
  return Object.assign(objA, objB);
}

const mergedObj = mergeObj<{ name: string }, { age: number }>(
  { name: "Archit" },
  { age: 24 }
);

console.log("mergedObj", mergedObj);

interface Lengthy {
  length: number;
}

function countAndDescribe<T extends Lengthy>(element: T): [T, string] {
  const descriptionText =
    element.length > 0
      ? `Got ${element.length} element${element.length > 1 ? "s" : ""}`
      : "Got no value";
  return [element, descriptionText];
}

console.log(countAndDescribe("A"));

function extractAndConvert<T extends object, U extends keyof T>(
  obj: T,
  key: U
) {
  return obj[key];
}

console.log(extractAndConvert({ name: "Archit" }, "name"));

class DataStorage<T extends string | number | boolean> {
  private data: T[] = [];

  addItem(item: T) {
    this.data.push(item);
  }

  removeItem(item: T) {
    if (!this.data.includes(item)) {
      return;
    }
    this.data.splice(this.data.indexOf(item), 1);
  }

  getItems() {
    return [...this.data];
  }
}

const store1 = new DataStorage<string>();

store1.addItem("Archit");
store1.addItem("Sehgal");
store1.removeItem("Sehgal");

console.log(store1.getItems());

interface CourseGoal {
  title: string;
  description: string;
  completeUntil: Date;
}

function createCourseGoal(
  title: string,
  description: string,
  date: Date
): CourseGoal {
  const courseGoal: Partial<CourseGoal> = {};
  courseGoal.title = title;
  courseGoal.description = description;
  courseGoal.completeUntil = date;
  return courseGoal as CourseGoal;
}

const names2: Readonly<string[]> = [
  "Archit",
  "Sehgal", 
]