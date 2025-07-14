const measureLoadTime = async (url) => {
  const start = performance.now();
  await fetch(url, {
    mode: "no-cors",
  });
  const end = performance.now();
  return end - start;
};

// const time = await measureLoadTime("http://localhost:3000/profile/bittu");
const time = await measureLoadTime(
  "https://b-intouch.me/profile/Bittu/device?lang=english"
);

// const time = await measureLoadTime(
//   "http://localhost:3000/profile/ParasTechnologies/60/share"
// );

console.log({ time });
