type Admin = {
  name: string;
  privileges: string[];
};

type Employee = {
  name: string;
  startDate: Date;
};

type ElevatedEmployee = Admin & Employee;

// interface Admin {
//     name: string;
//     privileges: string[];
// }

// interface Employee {
//     name: string;
//     startDate: Date;
// }

// interface ElevatedEmployee extends Admin, Employee { };

const e1: ElevatedEmployee = {
  name: "Archit",
  privileges: ["create-server"],
  startDate: new Date(),
};

type Combinable = string | number;
type Numeric = number | boolean;

type Universal = Combinable & Numeric;

type UnknownEmployee = Employee | Admin;

function printEmployeeInformation(emp: UnknownEmployee) {
  console.log(`Name: ${emp.name}`);
  if ("privileges" in emp) {
    console.log(`Privileges: ${emp.privileges}`);
  }
  if ("startDate" in emp) {
    console.log(`Start Date: ${emp.startDate}`);
  }
}

printEmployeeInformation(e1);

class Car {
  drive() {
    console.log("Driving...");
  }
}

class Truck {
  drive() {
    console.log("Driving a truck...");
  }

  loadCargo(amount: number) {
    console.log(`Loading cargo...${amount}`);
  }
}

type Vehicle = Car | Truck;

const v1 = new Car();
const v2 = new Truck();


function useVehicle(vehicle: Vehicle) {
  vehicle.drive();
  if (vehicle instanceof Truck) {
    vehicle.loadCargo(1000);
  }
}

useVehicle(v1);
useVehicle(v2);

interface Bird {
  type: "bird";
  flyingSpeed: number;
}

interface Horse{
  type: "horse";
  runningSpeed: number;
}

type Animal = Bird | Horse;

function moveAnimal(animal: Animal) {
  let speed: number;
  switch (animal.type) {
    case "bird":
      speed = animal.flyingSpeed;
      break;
    case "horse":
      speed = animal.runningSpeed;
      break;
  }
  console.log(`Moving at speed: ${speed}`);
}

moveAnimal({ type: "bird", flyingSpeed: 10 });

// const userInputElement = document.getElementById("user-input") as HTMLInputElement;

// userInputElement.value = "Hi there!"; 

interface ErrorContainer{
  [prop: string]: string;
} 

const errorBag: ErrorContainer = {
  email: "Not a valid email!",
  username: "Must start with a capital character!"
};


for (const error in errorBag) {
  console.log(`${error}: ${errorBag[error]}`);
}

