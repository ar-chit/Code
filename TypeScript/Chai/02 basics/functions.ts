function addTwo(num: number): number {
  return num + 2;
}

function getUpper(val: string) {
  return val.toUpperCase();
}

function signUp(
  name: string,
  email: string,
  password: string,
  isPaid: boolean
) {}

const login = (name: string, email: string, isPaid = false) => {};

addTwo(5);
getUpper("2");

signUp("user", "user@gmail.com", "12345678", true);

login("user", "user@gmail.com");

const heroes = ["thor", 2];

heroes.map((hero): string => {
  return `hero is ${hero}`;
});

function consoleError(errMsg: string): void {
  console.error(errMsg);
}

function handleError(errMsg: string): never {
  throw new Error(errMsg);
}
