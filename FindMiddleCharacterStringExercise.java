class Kata {
  public static String getMiddle(String word) {
      int DIVISOR = 2;
      int HALF_OF_GIVEN_NUMBER;
      
      char[] brokenUpWord = word.toCharArray();
      
      int numberOfLetters = brokenUpWord.length;

      if(numberOfLetters == 1) {
      String singleLetterResponse = String.valueOf(brokenUpWord[0]);
      return singleLetterResponse;
      }

      HALF_OF_GIVEN_NUMBER = numberOfLetters / DIVISOR; 

      String second = String.valueOf(brokenUpWord[HALF_OF_GIVEN_NUMBER]);
      String first = String.valueOf(brokenUpWord[HALF_OF_GIVEN_NUMBER + -1]);

    //if the word has an even number of letters
    if(numberOfLetters % 2 == 0) {
      return  first + second;
    } else {
    return second;
    }
  }
}