import java.util.Scanner;
public class Substrings
{
  Scanner s=new Scanner(System.in);
  String s1="xyz";//in case of user input -----> String s1=s.next();
  int i=0;
  void get() 
 {
  while( i<s1.length()) 
   {
	  System.out.println(s1.charAt(i));
	  i++;
   }
         for(i=0;i<s1.length();i++)
         {
	  for(int j=0;j<s1.length();j++) 
          {
		  System.out.print(s1.charAt(i));
		  System.out.println(s1.charAt(j));}
	  }
  }
    void dis() 
      {
        System.out.println(s1.substring(0,s1.length()));
      }

	public static void main(String[] args) 
         {
		
            Substrings s=new Substrings();
            s.get();
	    s.dis();
	 }

}