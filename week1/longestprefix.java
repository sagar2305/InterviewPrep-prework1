/*
Write a function to find the longest common prefix string amongst an array of strings.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.

Example:

Given the array as:

[

  "abcdefgh",

  "aefghijk",

  "abcefgh"
]
The answer would be “a”.

 NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details. 
*/

public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {
	    if (a.size() == 0) {
	        return "";
	    }
	    
	    if (a.size() == 1) {
	        return a.get(0);
	    }
	    
	    int min = a.get(0).length();
	    for (String s : a) {
	        if (s.length() < min) {
	            min = s.length();
	        }
	    }
	    
	    boolean match = true;
	    int index = 0;
	    while(index < min) { 
	        char character = a.get(0).charAt(index);
	        for (int i=1; i<a.size(); i++) {
	            if (a.get(i).charAt(index) != character) {
	                match = false;
	                break;
	            }
	        }
	        
	        if (!match) {
	            break;
	        }
	        
	        index++;
	    }
	    
	    return a.get(0).substring(0, index);
	}
}
