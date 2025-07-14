function logger<T extends new (...args: any[]) => any>(
  target: T,
  ctx: ClassDecoratorContext
) {
  console.log("logger decorator called");
  console.log(target);
  console.log(ctx);

  return class extends target {
    constructor(...args: any[]) {
      super(...args);
      console.log("Instance created with args:", args);
      console.log(this);
    }
  };
}

function autobind(
  target: (...args: any[]) => any,
  ctx: ClassMethodDecoratorContext
) {
  console.log(target, ctx);
}

@logger
class Person {
  name = "Archit";

  @autobind
  greet() {
    console.log(`Hi, I am ${this.name}`);
  }
}

const person = new Person();
console.log(person);
person.greet();
