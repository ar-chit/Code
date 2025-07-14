function printTime() {
    console.clear();
    let currentTime = new Date();
    const answer = currentTime.getHours() + ":" + currentTime.getMinutes() + ":" + currentTime.getSeconds();
    console.log(answer);
}
setInterval(printTime, 1000);
