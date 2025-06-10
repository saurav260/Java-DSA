public class patternsQue {

  public static void hollow_rectangle(int totRows, int totCol) {
    // outer loop
    for (int i = 1; i <= totRows; i++) {
      // inner loop
      for (int j = 1; j <= totCol; j++) {

        if (i == 1 || i == totRows || j == 1 || j == totCol) {
          // boundary cells
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void inverted_Rotated_Half_Pyramid(int n) {
    for (int i = 1; i <= n; i++) {
      // Spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // Stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

  public static void floyds_Triangle(int n) {
    int counter = 1;
    // outer loop
    for (int i = 1; i <= n; i++) {
      // inner loop
      for (int j = 1; j <= i; j++) {
        System.out.print(counter);
        counter++;
      }
      System.out.println();
    }

  }

  public static void triangle_pattern01(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }

      }
      System.out.println();
    }
  }

  public static void butterfly_Pattern(int n) {
    // Outer loop for first half
    for (int i = 1; i <= n; i++) {
      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // Mirror(2nd Half)
    for (int i = n; i >= 1; i--) {

      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      // spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }

      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void rhombus_Pattern(int n) {
    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // Stars
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void hollow_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }

      // hollow rectangle
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void diamond_pattern(int n) {

    for (int i = 1; i <= n; i++) {
      // For first half
      // Space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
    // for second half
    for (int i = n; i >= 1; i--) {
      // Space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // stars
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  public static void main(String args[]) {

    hollow_rectangle(5, 5);

    inverted_Rotated_Half_Pyramid(4);
    inverted_Rotated_Half_Pyramid(10);

    floyds_Triangle(5);

    triangle_pattern01(5);

    butterfly_Pattern(5);

    rhombus_Pattern(5);

    hollow_rhombus(5);

    diamond_pattern(5);
  }

}
