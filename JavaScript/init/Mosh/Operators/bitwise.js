// 1 = 00000001
// 2 = 00000010
// 3 = 00000011

console.log(0 | 0 | 1);
console.log(1 & 2);

// Read, Write and Execute
// Read: 00000100
// Write: 0000010
// Execute: 00000001

const Read = 4;
const Write = 2;
const Execute = 1;

let myPermission = 0;
myPermission = myPermission | Read;

let message1 = (myPermission & Read) ? 'Yes' : 'No';
console.log(message1);

let message2 = (myPermission & Write) ? 'Yes' : 'No';
console.log(message2);


