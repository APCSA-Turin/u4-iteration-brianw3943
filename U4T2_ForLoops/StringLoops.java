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
   String reverseString2(String origString) {
        String newString = "";
        for (int i = 0; i < origString.length(); i++) {
            String character = origString.substring(i, i + 1);
            newString = character + newString; 
        }
        return newString;
    }
 }
 