// Given a string, return a string where for every char in the original, there are two chars.
// doubleChar("The") → "TThhee"
// doubleChar("AAbb") → "AAAAbbbb"
// doubleChar("Hi-There") → "HHii--TThheerree"

public class doubleChar(){
    public String doubleChar(String str) {
        String result = "";
        
        //loop thru string
          //add char to result
          // add same char
          
        for(int i = 0; i < str.length(); i++){
          result = result + str.charAt(i);
          result = result + str.charAt(i);
        }
        
        return result;
      }

}