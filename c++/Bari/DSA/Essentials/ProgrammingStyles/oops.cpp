#include <iostream>
using namespace std;

class Rectangle
{
private:
  int length = 0;
  int breadth = 0;

public:
  Rectangle(int length, int breadth);

  void setLength(int length);

  void setBreadth(int breadth);

  int getLength();

  int getBreadth();

  int area();

  int perimeter();

  ~Rectangle();
};

Rectangle::Rectangle(int length, int breadth)
{
  setLength(length);
  setBreadth(breadth);
}

void Rectangle::setLength(int length)
{
  if (length >= 0 && length > this->breadth)
  {
    this->length = length;
  }
  else
  {
    throw -1;
  }
}

void Rectangle::setBreadth(int breadth)
{
  if (breadth >= 0 && this->length > breadth)
  {
    this->breadth = breadth;
  }
  else
  {
    throw -1;
  }
}

int Rectangle::getLength()
{
  return length;
}

int Rectangle::getBreadth()
{
  return breadth;
}

int Rectangle::area()
{
  return length * breadth;
}

int Rectangle::perimeter()
{
  return 2 * (length + breadth);
}

Rectangle::~Rectangle() {}

int main()
{
  int length = 0, breadth = 0;
  cout << "Enter length and breadth" << endl;
  cin >> length >> breadth;

  Rectangle * r1;
  try
  {
    r1 = new Rectangle(length, breadth);
  }
  catch (const std::exception &e)
  {
    std::cerr << e.what() << '\n';
  }

  int area = r1->area();
  int perimeter = r1->perimeter();

  cout << "Area: " << area << endl;
  cout << "Perimeter: " << perimeter << endl;

  return 0;
}