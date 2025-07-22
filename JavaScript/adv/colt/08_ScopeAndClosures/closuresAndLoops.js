// for (var i = 1; i < 6; i++) {
//   (function (j) {
//     setTimeout(function () {
//       console.log(j);
//     }, 1000 * j);
//   })(i);
// }

// for (var i = 1; i < 6; i++) {
//   {
//     const j = i;
//     setTimeout(() => {
//       console.log(j);
//     }, 1000 * j);
//   }
// }

for (let i = 1; i < 6; i++) {
  setTimeout(function () {
    console.log(i);
  }, 1000 * i);
}
