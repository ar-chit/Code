const currentDate = new Date();
const formattedTime = currentDate.toLocaleTimeString('en-US', { hour12: true });
console.log(formattedTime);
