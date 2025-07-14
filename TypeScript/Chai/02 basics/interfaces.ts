interface User {
  dbId: number;
  email: string;
  userId: string;
  googleId?: string;
  // startTrial: () => string;
  startTrial(): string;
  getCoupon(couponName: string): number;
}

interface User {
  githubToken: string;
}

interface Admin extends User {
  role: "admin" | "ta" | "learner";
}

const Archit: Admin = {
  dbId: 2233,
  email: "a@a.com",
  userId: "1234",
  role : "admin",
  startTrial: () => "Hello",
  githubToken: "git",
  getCoupon: (couponName) => couponName.length,
};

const couponName = "HELLO WORLD";

console.log(Archit.getCoupon(couponName));
