import java.util.Scanner;
import java.util.HashSet;
public class longestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        System.out.println("Enter A String:=");

        Scanner Sc=new Scanner(System.in);
        String str=Sc.nextLine();

        HashSet<Character> set=new HashSet<>();
        int left=0, maxLen=0;

        for(int right=0; right<str.length(); right++){

            while(set.contains(str.charAt(right))){

                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLen=Math.max(maxLen, right-left+1);
        }
        
        System.out.println("Final result is:="+maxLen);
    }
    
}
