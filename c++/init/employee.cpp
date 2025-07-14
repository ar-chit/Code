#include <iostream>
using namespace std;
class Employee
{
private:
    int id;
    string name;

public:
    Employee(int e, string n)
    {
        id = e;
        name = n;
    }
    int getEmployeeID() { return id; }
    string getName() { return name; }
};
class PartTimeEmployee : public Employee
{
private:
    int wage;

public:
    PartTimeEmployee(int e, string n, int w) : Employee(e, n)
    {
        wage = w;
    }
    int getWage() { return wage; }
};
class FullTimeEmployee : public Employee
{
private:
    int salary;

public:
    FullTimeEmployee(int e, string n, int s) : Employee(e, n)
    {
        salary = s;
    }
    int getSalary() { return salary; }
};

int main()
{
    PartTimeEmployee p1(1, "John", 600);
    FullTimeEmployee p2(2, "Don", 30000);
    cout << "Daily wage of " << p1.getName() << " is " << p1.getWage() << endl;
    cout << "Salary of " << p2.getName() << " is " << p2.getSalary() << endl;
    return 0;
}