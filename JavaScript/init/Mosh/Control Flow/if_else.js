// Hour
// If hour is between 6am and 12pm: Good Morning!
// If hour is between 12pm and 6am: Good Afternoon!
// Otherwise: Good evening!

let hour = 10;

if (hour >= 6 && hour < 12) {
    console.log("Good Morning!");
} else if (hour >= 12 && hour < 18) {
    console.log('Good afternoon!');
} else {
    console.log('Good evening!');
}

