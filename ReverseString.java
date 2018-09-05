import java.util.Scanner;
public class ReverseString 
{
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  String s1="";
  String reverse() 
  {
  for(int i=s.length()-1;i>=0;i--) {
	  s1=s1+s.charAt(i);
  }
  return s1;
  }
	public static void main(String[] args) 
        {
		
          ReverseString r=new ReverseString();
          String s2=r.reverse();
          System.out.println(s2);
	}
}