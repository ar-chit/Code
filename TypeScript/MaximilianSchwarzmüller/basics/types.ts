function add(n1: number, n2: number, printResult: boolean, resultPhrase: string) {
  const result = n1 + n2;
  if (printResult) {
    console.log(resultPhrase + result);
  } else {
    return result;
  }
}

let something: number;
something = 69;

const number1 = 5;
const number2 = 2.8;

add(number1, number2, true, "The sum is ");
