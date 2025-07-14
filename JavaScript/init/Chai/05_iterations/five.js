const coding = ['js', 'ruby', 'python', 'cpp'];

coding.forEach((val) => console.log(val));

function printMe(value) {
    console.log(value);
}

coding.forEach(printMe);

coding.forEach((val, index) => {
    console.log(val, index);
})

const myCoding = [
    {
        languageName: 'javascript',
        langiageFileName: 'js'
    },
    {
        languageName: 'java',
        langiageFileName: 'java'
    },
    {
        languageName: 'python',
        langiageFileName: 'py'
    }
]

myCoding.forEach((value) => {
    console.log(value.langiageFileName);
})