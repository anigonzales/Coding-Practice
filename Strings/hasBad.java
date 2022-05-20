
// Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with 
// "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
// hasBad("badxx") → true
// hasBad("xbadxx") → true
// hasBad("xxbadxx") → false

class hasBad{
  public boolean hasBad(String str) {
      if(str == "" || str.length() < 3 || str.charAt(str.length()-1) == 'a'){
        return false;
      }
      
      
      if(str.charAt(0) == 'b' && str.charAt(1) == 'a' && str.charAt(2) == 'd'){
        return true;
      }else if(str.charAt(1) == 'b' && str.charAt(2) == 'a' && str.charAt(3) == 'd'){
        return true;
      }
      
      
      return false;
    }
}