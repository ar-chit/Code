let str = "RAMA";
const arr = [];

let i = 0;

while (str[i]) {
  arr[i] = str[i]; //  This thing works
  i++;
}

i = 0;

while (arr[i]) {
  if (arr[i] === "A") {
    arr[i] = "";
  }
  i++;
}

let ans = "";

i = 0;

while (arr[i] !== undefined) {
  ans += arr[i];
  i++;
}

str = ans;

console.log(str); // Output: "RM"
