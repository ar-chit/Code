function add(n1: number, n2: number) {
  return n1 + n2;
}

function printResult(num: number): void {
  console.log("Result: " + num);
}


printResult(add(5, 12));

// const value = undefined;

let combineResults: (a: number, b: number) => number;
combineResults = add;

console.log(combineResults(8, 8));

function addAndHandle(n1: number, n2: number, cb: (num: number) => void) {
  const result = n1 + n2;
  const value = cb(result);
  console.log("value", value);
  
}

addAndHandle(10, 20, (result) => {
  console.log(result);
  return result;
});
