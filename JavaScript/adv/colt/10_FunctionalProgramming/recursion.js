// Factorial

// function factorial(n) {
//   let result = 1;
//   for (let i = n; i > 1; i--) {
//     result *= i;
//   }
//   return result;
// }

function factorial(n) {
  if (n === 0 || n === 1) {
    return 1;
  }
  return n * factorial(n - 1);
}

function print(n) {
  if (n === 0) {
    return;
  }
  print(n - 1);
  console.log(n);
}

function fibonacci(n) {
  if (n < 2) {
    return n;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
}

console.log(fibonacci(10));