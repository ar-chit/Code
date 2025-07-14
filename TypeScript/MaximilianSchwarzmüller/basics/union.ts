type Combinable = number | string;
type ConversionDescriptor = "as-number" | "as-text";

function combine(
  input1: Combinable,
  input2: number | string,
  resultConversion: ConversionDescriptor
) {
  const result =
    (typeof input1 === "number" && typeof input2 === "number") ||
    resultConversion === "as-number"
      ? +input1 + +input2
      : input1.toString() + input2.toString();

  return resultConversion === "as-number" ? +result : result.toString();
}

const result = combine("52", " 23", "as-number");
console.log(result);
