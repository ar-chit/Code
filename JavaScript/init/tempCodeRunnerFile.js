const measureLoadTime = async (url) => {
  const start = performance.now();
  await fetch(url, {
    mode: "no-cors",
  });
  const end = performance.now();
  return end - start;
};

measureLoadTime("https://main.dqre745hcyesp.amplifyapp.com/profile/bittu");
