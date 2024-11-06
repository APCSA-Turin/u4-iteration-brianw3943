package U4T3_LoopsString;

public class StringLoops {
    public StringLoops() { }
    public int countCharacters(String character, String searchString) {
        String searchStringLower = searchString.toLowerCase();
        String characterLower = character.toLowerCase();
        int charCount = 0;
        for (int i = 0; i < searchStringLower.length(); i++) {
            String currentCharacter = searchStringLower.substring(i, i + 1);
            if (currentCharacter.equals(characterLower)) {
                charCount++;
            }
        }
        return charCount;
    }
    public String reverseString(String origString) {
        String newString = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            String character = origString.substring(i, i + 1);
            newString += character;
        }
        return newString;
    }

    public String removeA(String str) {
        String strWithoutA = "";
        for (int i = 0; i < str.length(); i++) {
            String character = str.substring(i, i + 1);
            if (!character.equals("a")) {
                strWithoutA += character;
            }
        }
        return strWithoutA;
    }

  public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
    String newStr = "";
       for (int i = 0; i < origStr.length(); i++) {
           String character = origStr.substring(i, i + 1);
           if (character.equals(searchChar)) {
               newStr += replaceChar;
           } else {
               newStr += character;
           }
       }
       return newStr;
   }
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
    int index = 0;
       while (origStr.indexOf(searchChar) != -1) {
           index = origStr.indexOf(searchChar);
           origStr = origStr.substring(0, index) + replaceChar + origStr.substring(index + 1);
       }
       return origStr;
   }
   public int countString(String searchString, String origString) {
    int count = 0;
       int maxIndex = origString.length() - searchString.length();
       for (int i = 0; i <= maxIndex; i++) {
           String substring = origString.substring(i, i + searchString.length());
           if (substring.equals(searchString)) {
               count++;
           }
       }
       return count;
   }
   public String removeString(String searchString, String origString) {
    while (origString.indexOf(searchString) != -1) {
        int index = origString.indexOf(searchString);
        origString = origString.substring(0, index) + origString.substring(index + searchString.length());
    }
    return origString;
   }
   public void commaSeparated(int fromNum, int toNum) {
    if (fromNum == toNum) {
           System.out.print(fromNum);
       } else if (fromNum < toNum) {
           System.out.print(fromNum);
           for (int i = fromNum + 1; i <= toNum; i++) {
               System.out.print(", " + i);
           }
       } else {
           System.out.print(fromNum);
           for (int i = fromNum - 1; i >= toNum; i--) {
               System.out.print(", " + i);
           }
       }
       System.out.println();
   }
   public boolean isPalindrome(String myString) {
    String noSpaces = removeString(" ", myString);
    String reversed = reverseString(noSpaces);
    return noSpaces.equals(reversed);
  }
  public void multiPrint(String toPrint, int num) {
    if (num <= 0) {
        System.out.println("[]");
    } else {
        System.out.print("[" + toPrint);
        for (int i = 2; i <= num; i++) {
            System.out.print(" " + toPrint);
        }
        System.out.println("]");
    }
  }
 }
 
