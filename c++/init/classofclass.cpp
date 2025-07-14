#include <iostream>
using namespace std;
class student
{
private:
    int rollno;
    string name;
    int maths;
    int phy;
    int chem;

public:
    student(int r, string n, int m, int p, int c)
    {
        rollno = r;
        name = n;
        maths = m;
        phy = p;
        chem = c;
    }
    int total()
    {
        return maths + phy + chem;
    }
    char grade()
    {
        float avg = total() / 3;
        if (avg > 60)
        {
            return 'A';
        }
        else if (avg <= 60 && avg > 40)
        {
            return 'B';
        }
        else
        {
            return 'C';
        }
    }
};

int main()
{
    int roll;
    string name;
    int m, p, c;
    cout << "Enter the roll no. of student" << endl;
    cin >> roll;
    cout << "Enter the name of student " << endl;
    cin >> name;
    cout << "Enter the marks of mathematics, physics and chemistry " << endl;
    cin >> m >> p >> c;
    student s(roll, name, m, p, c);
    cout << "Total marks: " << s.total() << endl;
    cout << "Grade of student " << s.grade() << endl;
    return 0;
}