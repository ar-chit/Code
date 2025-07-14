const fs = require('fs');

function clean(data) {
    var arr = data.split(' ');
    var ansArr = [];
    for (var i = 0; i < arr.length; i++) {
        if (arr[i].length === 0) {

        } else {
            ansArr.push(arr[i]);
        }
    }
    return ansArr.join(' ');
}

function afterContentsUpdated(err) {
    if (err) {
        console.error(err);
        return;
    }

    console.log('File has been written.');
}

function printFile(err, data) {
    if (err) {
        console.error(err);
        return;
    }

    let cleanedData = clean(data);
    fs.writeFile('/Users/architsehgal/Desktop/Code/JavaScript/test.txt', cleanedData, 'utf8', afterContentsUpdated);
}

fs.readFile('/Users/architsehgal/Desktop/Code/JavaScript/test.txt', 'utf8', printFile);
