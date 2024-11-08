public class Main {
   public static void main(String[] args)
   {
    int result = 0;
    int k = 0;
    while (k < 4) {
      int m = 0;
      while (m < 3) {  // nested while loop
        result++;
        m++;
        System.out.println("k " + k + ", m " + m);
      }
      k++;
    }
    System.out.println("result: " + result);
   }
}
