public class StringManipulator {
    
    // Trim both input strings and then concatenate them. Return the new string. Feel free to use the trim method of the String class.
    public String trimAndConcat(String str1, String str2) {
        String newString = (str1.trim() + str2.trim());
        return newString;
    }

    // Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.
    public Integer getIndexOrNull(String str, char letter) {
        Integer index = (str.indexOf(letter));
        if (index < 0) {
            return null;
        } 
        else {
            return index;
        }
    }
    
    // Method Overloading!  Get the index of the start of the substring and return either the index or null.
    public Integer getIndexOrNull(String str1, String str2) {
        Integer index = (str1.indexOf(str2));
        if (index < 0) {
            return null;
        }
        else {
            return index;
        }
    }

    // Get a substring using a starting and ending index, and concatenate that with the second string input to our method. 
    public String concatSubstring(String str1, int index1, int index2, String str2) {
        String newString = str1.substring(index1, index2) + str2;
        return newString;
    }
}