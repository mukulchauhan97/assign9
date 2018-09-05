import java.util.*;
public class ReplaceVowels {

       public static void main(String[] args) 
       {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter : ");
        String str1 = s.nextLine();
        String str2 = str1.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str2);
       }
 
}