const crypto = require("crypto");

function encrypt(text, keyBase64, ivBase64) {
  const key = Buffer.from(keyBase64, "base64");
  const iv = Buffer.from(ivBase64, "base64");

  const cipher = crypto.createCipheriv("aes-256-cbc", key, iv);
  let encrypted = cipher.update(text, "utf8", "base64");
  encrypted += cipher.final("base64");
  return encrypted;
}

const password = "WdpJ5r3aYfdf@z5";

// These must be securely stored/shared
const keyBase64 = "n6IYTAbk1shC5ZAtCRq1lzP7AUNYcKgfZ3QHVglx4Yg=";
const ivBase64 = "mIGWVsJqzFyYoHVR84mxdQ==";

const encryptedPassword = encrypt(password, keyBase64, ivBase64);

console.log({encryptedPassword})