import java.util.Arrays;

public class mathematics {

  public static int countDigits(int a) {
    int count = 0;
    while (a != 0) {
      a = a / 10;
      count++;
    }
    return count;
  }

  public static int reverse(int a) {
    int reverse = 0;
    int temp = a;
    while (temp != 0) {
      int n = temp % 10;
      reverse = reverse * 10 + n;
      temp = temp / 10;
    }
    return reverse;
  }

  public static boolean isPalindrome(int a) {
    int n = reverse(a);
    return (n == a);
  }

  public static int factorial(int a) {
    int factorial = 1;
    while (a > 0) {
      factorial = factorial * a;
      a--;
    }
    return factorial;
  }

  public static int trailingZeroesOfFactorial(int a) {
    int b = factorial(a);
    int count = 0;
    while (b % 10 == 0) {
      count++;
      b = b / 10;
    }
    return count;
  }

  public static int HCF(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    int factor = 0;

    if (a > b) {
      factor = b;
    } else {
      factor = a;
    }

    while (factor > 0) {
      if (a % factor == 0 && b % factor == 0) {
        break;
      }
      factor--;
    }
    return factor;
  }

  public static int LCM(int a, int b) {
    int multiple = 0;
    if (a > b) {
      multiple = b;
    } else {
      multiple = a;
    }
    while (true) {
      if (multiple % a == 0 && multiple % b == 0) {
        return multiple;
      }
      multiple++;
    }
  }

  public static boolean isPrime(int a) {
    int count = 0;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0) {
        count++;
      }
    }
    return (count == 2);
  }

  public static boolean isPrimeEfficient(int a) {
    if (a == 1) {
      return false;
    } else if (a == 2 || a == 3) {
      return true;
    } else if (a % 2 == 0 || a % 3 == 0) {
      return false;
    } else {
      for (int i = 5; i * i <= a; i += 6) {
        if (a % i == 0 || a % (i + 2) == 0) {
          return false;
        }
      }
      return true;
    }
  }

  public static void primeFactors(int a) {
    for (int i = 2; i < a; i++) {
      if (isPrimeEfficient(i)) {
        int x = i;
        while (a % x == 0) {
          System.out.println(i);
          x = x * i;
        }
      }
    }
  }

  public static void primes(int a) {
    int count = 0;
    for (int i = 2; i <= a; i++) {
      if (isPrimeEfficient(i)) {
        count++;
        System.out.println(i);
      }
    }
    System.out.println("Total: " + count);
  }

  public static int sieveOfEratosthenes(int a) {
    boolean[] primes = new boolean[a];
    Arrays.fill(primes, true);

    int ans = 0;

    for (int i = 2; i < a; i++) {
      if (primes[i]) {
        ans++;
        System.out.println(i);

        int j = i * 2;
        while (j < a) {
          primes[j] = false;
          j += i;
        }
      }
    }
    System.out.println();
    return ans;
  }

  public static int computingPowers(int a, int b) {
    int answer = 1;
    for (int i = 1; i <= b; i++) {
      answer = answer * a;
    }
    return answer;
  }

  public static int absoluteValue(int a) {
    if (a < 0) {
      return -a;
    } else {
      return a;
    }
  }

  public static void main(String args[]) {
    // System.out.println(factorial(5));
    // System.out.println(LCM(12, 36));
    System.out.println(sieveOfEratosthenes(1000));
  }
}
