function createAccount(pin, initialAmt) {
  return {
    checkBalance(givenPin) {
      if (givenPin === pin) {
        return `Your balance is: $${initialAmt}`;
      } else {
        return "Invalid PIN.";
      }
    },
    deposit(givenPin, amount) {
      if (givenPin === pin) {
        initialAmt += amount;
        return `Successfully deposited $${amount}. New balance: $${initialAmt}`;
      } else {
        return "Invalid PIN.";
      }
    },
    withdraw(givenPin, amount) {
      if (givenPin === pin) {
        if (amount > initialAmt) {
          return "Withdrawal amount exceeds balance.";
        } else {
          initialAmt -= amount;
          return `Successfully withdrew $${amount}. New balance: $${initialAmt}`;
        }
      } else {
        return "Invalid PIN.";
      }
    },
    changePin(oldPin, newPin) {
      if (oldPin === pin) {
        pin = newPin;
        return "PIN changed successfully.";
      } else {
        return "Invalid old PIN.";
      }
    }
  }
}