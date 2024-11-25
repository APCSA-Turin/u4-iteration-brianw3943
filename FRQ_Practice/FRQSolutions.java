package FRQ_Practice;

public class FRQSolutions {
    public void printNums(int value, int numRounds) {
        for (int i = 0; i < numRounds; i++) {
            int rand = 10;
            while (rand != value) {
        rand = (int) (Math.random() * 10);
        System.out.print(rand);
    }
    System.out.println();
    }
    }    
    public String longestStreak(String str) {
        String maxChar = "";
        int maxLen = 0;
    
        int cur = 0;
        String curChar = "";
        for (int i = 0; i < str.length(); i++) {
            curChar = str.substring(i, i + 1);
            cur = i + 1;
            while (cur < str.length() && str.substring(cur, cur + 1).equals(curChar)) {
                cur++;
            }
            if (cur - i > maxLen) {
                maxLen = cur - i;
                maxChar = curChar;
            }
        }
        return maxChar + " " + maxLen;
    }
    
    
}