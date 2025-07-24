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

print(10);