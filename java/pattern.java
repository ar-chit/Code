

public class pattern {

  public static void rectangle(int row, int col) {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  public static void square(int a) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  public static void HollowRectangle(int row, int col) {
    for (int i = 0; i < row; i++) {
      if (i == 0 || i == row - 1) {
        for (int j = 0; j < col; j++) {
          System.out.print("* ");
        }
      } else {
        System.out.print("* ");
        for (int k = 0; k < col - 2; k++) {
          System.out.print("  ");
        }
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  public static void halfPyramid(int a) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  public static void invertedHalfPyramid(int a) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a - i; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  public static void numericHalfPyramid(int a) {
    for (int i = 0; i < a; i++) {
      int n = 1;
      for (int j = 0; j < i + 1; j++) {
        System.out.print(n + " ");
        n++;
      }
      System.out.println("");
    }
  }

  public static void invertedNumericHalfPyramid(int a) {
    for (int i = 0; i < a; i++) {
      int n = 1;
      for (int j = 0; j < a - i; j++) {
        System.out.print(n + " ");
        n++;
      }
      System.out.println("");
    }
  }

  public static void fullPyramid(int a) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a - i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i + 1; k++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  public static void invertedFullPyramid(int a) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < a - i; k++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  public static void numericFullPyramid(int a) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < (a - i - 1) * 2; j++) {
        System.out.print(" ");
      }
      int n = i + 1;
      for (int k = 0; k < i + 1; k++) {
        System.out.print(n + " ");
        n++;
      }
      n -= 2;
      for (int l = 0; l < i; l++) {
        System.out.print(n + " ");
        n--;
      }

      System.out.println("");
    }
  }

  public static void numericHollowPattern(int a) {
    int r = 1;
    for (int i = 0; i < a - 1; i++) {
      for (int j = 0; j < a - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.print("1");

      if (i >= 1) {
        for (int k = 0; k < r; k++) {
          System.out.print(" ");
        }
        r += 2;
        System.out.print(i + 1);
      }

      System.out.println("");
    }
    for (int i = 1; i <= a; i++) {
      System.out.print(i + " ");
    }
    System.out.println("");
  }

  public static void hollowInvertedPyramid(int a) {
    for (int i = 0; i < a; i++) {
      System.out.print("*");
    }
    System.out.println("");
    for (int i = 1; i < a - 1; i++) {
      System.out.print("*");
      for (int j = 0; j < a - i - 2; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
    }
    System.out.println("*");
  }

  public static void diamond(int a) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a - i - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i + 1; k++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < a - i; k++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  public static void hollowDiamond(int a) {
    int r = 1;
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      if (i >= 1) {
        for (int k = 0; k < r; k++) {
          System.out.print(" ");
        }
        r += 2;
        System.out.print("*");
      }
      System.out.println("");
    }

    int s = ((a - 1) * 2) - 1;
    for (int i = 0; i < a - 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (int k = 0; k < s; k++) {
        System.out.print(" ");
      }
      s -= 2;
      System.out.print("*");
      System.out.println("");
    }
    for (int i = 0; i < a - 1; i++) {
      System.out.print(" ");
    }
    System.out.println("*");
  }

  public static void flippedSolidDiamond(int a) {
    for (int i = 0; i < a * 2; i++) {
      System.out.print("* ");
    }
    System.out.println();

    int r = 4;
    for (int i = 0; i < a - 1; i++) {
      for (int j = 0; j < a - i - 1; j++) {
        System.out.print("* ");
      }
      for (int k = 0; k < r; k++) {
        System.out.print(" ");
      }
      r += 4;
      for (int l = 0; l < a - i - 1; l++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    int s = (a - 1) * 4;
    for (int i = 0; i < a - 1; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("* ");
      }
      for (int k = 0; k < s; k++) {
        System.out.print(" ");
      }
      s -= 4;
      for (int l = 0; l < i + 1; l++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int i = 0; i < a * 2; i++) {
      System.out.print("* ");
    }
    System.out.println();
  }

  public static void fancyPattern1(int a) {
      System.out.println("1");
      int r = 2;
      for (int i = 0; i < a - 1; i++) {
          for (int j = 0; j < i + r + 1; j++) {
              if (j % 2 == 0) {
                  System.out.print(i + 2);
              } else {
                  System.out.print(" * ");
              }
          }
          r++;
          System.out.println();
      }
      int s = a*2 - 3;
      for (int i = 0; i < a - 2; i++) {

          for (int j = 0; j < s; j++) {
              if (j % 2 == 0) {
                  System.out.print(a - i - 1);
              } else {
                  System.out.print(" * ");
              }
          }
          s -= 2;
          System.out.println();

      }
      System.out.println("1");
  }
  
  public static void alphabeticPalindromePyramid(int a) {
    System.out.println("A");
    for (int i = 0; i < a - 1; i++) {
      char ch = 'A';
      for (int j = 0; j < i + 2; j++) {
        System.out.print(ch + " ");
        ch++;
      }
      ch -= 2;
      while (ch >= 'A') {
        System.out.print(ch + " ");
        ch--;
      }
      System.out.println();
    }
  }
  
  public static void fancyPattern2(int a) {
    int s = 1;
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a - i + 3; j++) {
        System.out.print("*");
      }
      for (int k = 0; k < s; k++) {
        if (k % 2 == 0) {
          System.out.print(i + 1);
        } else {
          System.out.print("*");
        }
      }
      s += 2;
      for (int j = 0; j < a - i + 3; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void fancyPattern3(int a) {
    System.out.println("*");
    for (int i = 0; i < a - 1; i++) {
      System.out.print("* ");
      int c = 1;
      for (int j = 0; j < i + 1; j++) {
        System.out.print(c + " ");
        c++;
      }
      c -= 2;
      while (c >= 1) {
        System.out.print(c + " ");
        c--;
      }
      System.out.print("*");
      System.out.println();
    }
    for (int i = 0; i < a - 2; i++) {
      System.out.print("* ");
      int c = 1;
      for (int j = 0; j < a - i - 3; j++) {
        System.out.print(c + " ");
        c++;
      }
      while (c >= 1) {
        System.out.print(c + " ");
        c--;
      }
      System.out.print("*");
      System.out.println();
    }
    System.out.println("*");
  }

  public static void fancyPattern4(int a) {
    System.out.println("1");
    int c = 2;
    int r = 3;
    for (int i = 0; i < a - 1; i++) {
      for (int j = 0; j < r; j++) {
        if (j % 2 == 0) {
          System.out.print(c);
          c++;
        } else {
          System.out.print(" * ");
        }
      }
      r += 2;
      System.out.println();
    }
  }

  public static void floydsTriangle(int a) {
    int n = 1;
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(n + " ");
        n++;
      }
      System.out.println();
    }
  }

  public static void butterflyEffect(int a) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("* ");
      }
      for (int k = 0; k < a - i-1; k++) {
        System.out.print("    ");
      }
      for (int j = 0; j < i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a - i; j++) {
        System.out.print("* ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("    ");
      }
      for (int j = 0; j < a - i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    // rectangle(3, 5);
    // square(5);
    // HollowRectangle(5, 10);
    // halfPyramid(5);
    // invertedHalfPyramid(5);
    // numericHalfPyramid(5);
    // invertedNumericHalfPyramid(5);
    fullPyramid(5);
    // invertedFullPyramid(6);
    // numericFullPyramid(5);
    // numericHollowPattern(5);
    // hollowInvertedPyramid(20);
    // diamond(5);
    // hollowDiamond(69);
    // flippedSolidDiamond(5);
    // fancyPattern1(9);
    // alphabeticPalindromePyramid(25);
    // fancyPattern2(9);
    // fancyPattern3(9);
    // fancyPattern4(4);
    // floydsTriangle(7);
    // butterflyEffect(5);
  }
}
