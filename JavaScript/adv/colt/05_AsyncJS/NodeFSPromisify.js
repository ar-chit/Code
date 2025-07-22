const fs = require("fs");

// fs.readFile("./haiku1.txt", "utf8", (err, data) => {
//   if (err) {
//     console.log("ERR!!", err);
//   } else {
//     console.log("HAIKU 1");
//     console.log(data);
//     fs.readFile("./haiku2.txt", "utf8", (err, data) => {
//       if (err) {
//         console.log("ERR!!", err);
//       } else {
//         console.log("HAIKU 2");
//         console.log(data);
//         fs.readFile("./haiku3.txt", "utf8", (err, data) => {
//           if (err) {
//             console.log("ERR!!", err);
//           } else {
//             console.log("HAIKU 3");
//             console.log(data);
//           }
//         });
//       }
//     });
//   }
// });

function asyncReadFile(fileName) {
  fs.readFile(fileName, "utf8", (err, data) => {
    if (err) {
      console.log("ERR!!", err);
      return Promise.reject(err);
    } else {
      return data;
    }
  });
}

// asyncReadFile("./haiku1.txt")
//   .then((data) => {
//     console.log("HAIKU 1");
//     console.log(data);
//     return asyncReadFile("./haiku2.txt");
//   })
//   .then((data) => {
//     console.log("HAIKU 2");
//     console.log(data);
//     return asyncReadFile("./haiku3.txt");
//   })
//   .then((data) => {
//     console.log("HAIKU 3");
//     console.log(data);
//   })
//   .catch((err) => console.log("ERR", err));

async function getHaikus() {
  try {
    const haiku1 = asyncReadFile("./haiku1.txt");
    console.log("HAIKU 1");
    console.log(haiku1);
    const haiku2 = asyncReadFile("./haiku2.txt");
    console.log("HAIKU 2");
    console.log(haiku2);
    const haiku3 = asyncReadFile("./haiku3.txt");
    console.log("HAIKU 3");
    console.log(haiku3);
  } catch (e) {
    console.log("ERR", e);
  }
}

getHaikus();
