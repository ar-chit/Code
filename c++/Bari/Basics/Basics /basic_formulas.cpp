#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    // Area of triangle
    int base = 5;
    int height = 10;

    int AreaOfTriangle = (base * height) / 2;

    cout << "Area of triangle is " << AreaOfTriangle << endl;

    // Sum of first n natural numbers
    int number = 15;

    int sum = number * (number + 1) / 2;

    cout << "sum is " << sum << endl;

    // Finding roots of quadratic equations
    int a = 3;
    int b = 8;
    int c = 4;

    float r1 = (float)(-b + sqrt(b * b - 4 * a * c)) / (2 * a);
    float r2 = (float)(-b - sqrt(b * b - 4 * a * c)) / (2 * a);

    cout << "Roots are " << r1 << " and " << r2 << endl;

    // Calculate Speed
    int u = 10;
    int v = 40;
    int acceleration = 3;

    int speed = (v * v - u * u) / (2 * acceleration);
    cout << "Speed is " << speed << endl;

    // Area of circle
    float radius = 10;

    float AreaOfCircle = M_PI * radius * radius;

    cout << "Area of Circle is " << AreaOfCircle << endl;


    // Net Salary
    int BasicSalary = 10000;
    float PercentageOfAllowance = 5;
    float PercentageOfDeduction = 2;

    float NetSalary = BasicSalary + (BasicSalary * PercentageOfAllowance) - (BasicSalary * PercentageOfDeduction);

    cout << "Your Net Salary is " << NetSalary << endl;

    return 0;
}