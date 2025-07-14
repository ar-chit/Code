function fun(n: number): number {
  return n > 100 ? n - 10 : fun(fun(n + 11));
}

console.log(fun(95));