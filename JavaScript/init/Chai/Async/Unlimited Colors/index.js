let intervalId; // Declare a variable to store the interval ID

function getRandomColor() {
    var red = Math.floor(Math.random() * 256);
    var green = Math.floor(Math.random() * 256);
    var blue = Math.floor(Math.random() * 256);
    var color = 'rgb(' + red + ',' + green + ',' + blue + ')';
    return color;
}

const startButton = document.querySelector('#start');
const stopButton = document.querySelector('#stop');

startButton.addEventListener('click', () => {
    intervalId = setInterval(() => {
        document.querySelector('body').style.backgroundColor = getRandomColor();
    }, 1000);
});

stopButton.addEventListener('click', () => {
    clearInterval(intervalId);
});
