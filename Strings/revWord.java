// Given a string s, reverse the order of characters in each word within a sentence while 
// still preserving whitespace and initial word order.

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

class revWord {
    public String reverseWords(String s) {
        //split each word into a new string array
        String[] str = s.split(" ");
        
	   String finalresult = "";
        
        //loop thru str array
	   for(int i = 0; i < str.length; i++){
           
	        String result = "";
           
           //loop thru word
	   	    for(int j = 0; j < str[i].length(); j++){
                //reverse word in result str
	   		    result += str[i].charAt(str[i].length() - j - 1);
	   	    }
           
	   	    result += " ";
           //concat reverse word into final result
	   	    finalresult += result;
	   }
        
        //return final result, remove whitespaces
        return finalresult.trim();
        
    }
}