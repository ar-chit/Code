function specialAdd(total) {
 if (total === undefined) return 0;
  return function add(num) {
    if (num === undefined) {
      return total;
    }
    total += num;
    return add;
  }
}

console.log(specialAdd());
console.log(specialAdd(1)(2)());
console.log(specialAdd(2)(8)(5)(1)());
