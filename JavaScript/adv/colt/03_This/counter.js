class Counter {
  constructor(startingNum = 0, incrementAmt = 1) {
    this.count = startingNum;
    this.incrementAmt = incrementAmt;
  }
  start() {
    setInterval(function () {
      console.log("THIS is: ", this);
      console.log(this.count);
      this.count += this.incrementAmt;
    }, 1000);
  }

  incrementAndPrint() {
    console.log(this.count);
    this.count += this.incrementAmt;
  }
}

const counter = new Counter();
counter.start();