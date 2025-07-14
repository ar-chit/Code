const fs = require('fs');

let data = "Is this really happening.";

function afterContentsUpdated(err) {

    if (err) {
        console.error(err); return;

    } console.log('File has been written')

}

fs.writeFile('/Users/architsehgal/Desktop/Code/JavaScript/test.txt', data, 'utf8', afterContentsUpdated);

