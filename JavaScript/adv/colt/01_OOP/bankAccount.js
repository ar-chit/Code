// BankAccount class
//  - Properties
//      - balance (defaults to 0 if not provided)
//      - accountHolder
//      - accountNumber
// - Methods
//   - deposit(amt) - increases balance by amt
//   - withdraw(amt) - descreases balance by amt.

class BankAccount{
  constructor(accountHolder, accountNumber, balance = 0) {
    if (typeof accountHolder !== 'string' || accountHolder.trim() === '') {
      throw new Error(`Invalid account holder: ${accountHolder}`);
    }
    if (typeof accountNumber !== 'string' || accountNumber.trim() === '') {
      throw new Error(`Invalid account number: ${accountNumber}`);
    }
    if (!Number.isFinite(balance) || balance < 0) {
      throw new Error(`Invalid balance: ${balance}`);
    }

    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  deposit(amt) {
    if (!Number.isFinite(amt) || amt <= 0) {
      throw new Error(`Invalid deposit amount: ${amt}`);
    }
    this.balance += amt;
  }

  withdraw(amt) {
    if (!Number.isFinite(amt) || amt <= 0) {
      throw new Error(`Invalid withdrawal amount: ${amt}`);
    }
    if (amt > this.balance) {
      throw new Error(`Insufficient funds for withdrawal: ${amt}`);
    }
    this.balance -= amt;
  }
}