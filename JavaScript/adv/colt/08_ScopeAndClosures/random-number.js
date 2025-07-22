function guessingGame() {
  let num = Math.floor(Math.random() * 100) + 1;

  console.log(`The number to guess is: ${num}`); // For debugging purposes

  return (guessedNum) => {
    if(num === guessedNum) {
      return "Congratulations! You've guessed the number!";
    } else if (num < guessedNum) {
      return "Too high! Try again.";
    } else {
      return "Too low! Try again.";
    }
  }
}

const guess = guessingGame();

for (let i = 1; i <= 100; i++){
  console.log(`Guessing: ${i} - Result: ${guess(i)}`);
  if (guess(i) === "Congratulations! You've guessed the number!") {
    break;
  }
} 