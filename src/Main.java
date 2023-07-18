import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs); // orders alphabetically so we can compare the two strings that have smallest common substring
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break; //break loop so no excessive loops
            }
        }
        return s1.substring(0, idx); // retunn the substring
    }
}


// O(2n) if i compare each strng index to first array overer and over. meaens first string could be itrrated 200 times,
// but all the othrers just once
// still nope

// O(n2) and its still giving me trouble. need to just iterative through oncee...but how..
class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i =0; i < 200; i++){ // loop through firt index all arrays
            char temp = strs[0].charAt(i);
            boolean status = true;
            for(String a: String[] strs){
                if (a.charAt[i] == temp){
                    status = true;
                }
            }
           // if (status){ add letter to builder.
        }
    }
}


// for i<200, while arrrayOne charAt[i] == arrayTWo charAt[i] && arrayOne charAt[i] == arraryThree
// charAt[i], count ++.
// lngth = Math.max (1.length,2,3?) can i hav 3 variables passed? this would shorten the loop. actually i want math.min...