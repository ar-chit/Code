export const measureLoadTime = async (url: string): Promise<number> => {
  const start = performance.now();
  await fetch("https://main.dqre745hcyesp.amplifyapp.com/profile/bittu", {
    mode: "no-cors",
  });
  const end = performance.now();
  return end - start;
};
