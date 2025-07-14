abstract class Department {
  static fiscalYear = 2020;
  protected employees: string[] = [];

  constructor(public readonly id: string, public name: string) {}

  abstract describe(this: Department): void;

  addEmployee(employee: string) {
    this.employees.push(employee);
  }

  printEmployeesInfo(this: Department) {
    console.log(this.employees);
  }
}

class ITDepartment extends Department {
  constructor(id: string, private admins: string[]) {
    super(id, "IT");
    this.admins = admins;
  }

  describe(this: Department) {
    console.log(`Name: ${this.name}, id: ${this.id}`);
  }
}

class AccountingDepartment extends Department {
  private lastReport: string;
  private static instance: AccountingDepartment;

  private constructor(id: string, private reports: string[]) {
    super(id, "Accounting");
    this.lastReport = reports[reports.length - 1];
  }

  describe(this: Department) {
    console.log(`Name: ${this.name}, id: ${this.id}`);
  }

  addEmployee(employee: string) {
    if (this.employees.includes(employee)) {
      return;
    }
    this.employees.push(employee);
  }

  set addReport(text: string) {
    this.reports.push(text);
    this.lastReport = text;
  }

  get printReports() {
    return this.reports;
  }

  printLastReport() {
    console.log(this.lastReport);
  }

  static get getInstance() {
    if (this.instance) {
      return this.instance;
    }
    this.instance = new AccountingDepartment("a1", []);
    return this.instance;
  }
}
// const accounting = new Department("a1", "Accounting");

// accounting.describe();

// const accountingCopy = { describe: accounting.describe };

// accountingCopy.describe.bind(accounting)();

// accounting.addEmployee("Employee1");
// accounting.addEmployee("Employee2");

// accounting.printEmployeesInfo();

const it = new ITDepartment("i1", ["ADMIN"]);

it.addEmployee("Employee1");

const accounting = AccountingDepartment.getInstance;

accounting.addReport = "report2";

accounting.addEmployee("Employee1");

accounting.printEmployeesInfo();

accounting.printLastReport();

console.log(Department.fiscalYear);
