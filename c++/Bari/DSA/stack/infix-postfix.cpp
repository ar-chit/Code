#include <iostream>
using namespace std;

bool isOperator(char ch) {
  return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
}

int getPrecedence(char ch) {
  int precedence = -1;
  switch (ch) {
    case '+':
    case '-':
      precedence = 1;
      break;
    case '*':
    case '/':
      precedence = 2;
      break;
    case '^':
      precedence = 3;
      break;
    default:
      precedence = -1;
      break;
  }
  return precedence;
}

string infixToPostfix(string infix) {
  stack<char> charStack;

  string output;

  for (int i = 0; i < infix.length(); i++) {
    char ch = infix[i];
    if (ch == '(') {
      charStack.push(ch);
    } else if (ch == ')') {
      while (!charStack.empty() && charStack.top() != '(') {
        output += charStack.top();

        charStack.pop();
      }
      if (charStack.top() == '(') {
        charStack.pop();
      }
    } else if (isalpha(ch)) {
      output += ch;
    } else if (isOperator(ch)) {
      while (!charStack.empty() &&
             (getPrecedence(ch) < getPrecedence(charStack.top()) ||
              (getPrecedence(ch) == getPrecedence(charStack.top()) &&
               ch != '^'))) {
        output += charStack.top();
        charStack.pop();
      }
      charStack.push(ch);
    }
  }

  while (!charStack.empty()) {
    output += charStack.top();
    charStack.pop();
  }

  return output;
}

int evaluatePostfix(string postfix) {
  stack<char> charStack;

  int ans;

  for (int i = 0; i < postfix.length(); i++) {
    char ch = postfix[i];
    if (isdigit(ch)) {
      charStack.push(ch);
    } else if (isOperator(ch)) {
      int y = charStack.top() - '0';
      charStack.pop();

      int x = charStack.top() - '0';
      charStack.pop();

      switch (ch) {
        case '+':
          ans = x + y;
          break;
        case '-':
          ans = x - y;
          break;
        case '*':
          ans = x * y;
        case '/':
          ans = x / y;
        default:
          break;
      }

      charStack.push(ans);
    }
  }

  return ans;
}

int main() {
  string str = "35*62/+4-";
  // cout << infixToPostfix(str) << endl;
  cout << evaluatePostfix(str) << endl;

  return 0;
}