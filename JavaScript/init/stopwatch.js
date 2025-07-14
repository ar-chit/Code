var counter = 0;

function stopwatch(n) {
    console.clear();
    console.log(counter);
    counter += 1;
}

setInterval(stopwatch, 1000);