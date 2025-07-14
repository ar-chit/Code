const fs = require('fs');

function printFile(err, data) {
    if (err) {
        console.error(err);
        return;
    }
    console.log(data);
}

fs.readFile('/Users/architsehgal/Desktop/Code/JavaScript/test.txt', 'utf8', printFile);