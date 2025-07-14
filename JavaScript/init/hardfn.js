const { isUtf8 } = require("buffer");
const fs = require("fs");


fs.readFile("/Users/architsehgal/Desktop/Code/JavaScript/test.txt", "utf-8", (err, data) => {
    console.log(data);
}
)