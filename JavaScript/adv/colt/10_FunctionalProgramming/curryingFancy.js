function add(...args) {
  return args.reduce((acc, curr) => acc + curr, 0);
}

function curry(fn) {
  return function curried(...args) {
    console.log(args.length, fn.length, args);
    if (args.length >= fn.length) {
      return fn.apply(this, args);
    } else {
      return function (...args2) {
        return curried.apply(this, args.concat(args2));
      };
    }
  };
}

const curriedAdd = curry(add);
console.log(curriedAdd(1)(2)(3));
