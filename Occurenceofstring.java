import java.util.Scanner;
public class OccurenceofString
{
	String s2,s1;
	    void get(){
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter : ");
	    s1=s.nextLine();
        System.out.println(" Enter : ");
	    //s.nextLine();
        s2=s.nextLine();
		}
        void run() 
        {
	         if(s1.contains(s2)==true) 
             {
		      System.out.println("String2 is present in String1");
	          }
               else 
                  {
		           System.out.println("String2 not present in String1");
	              }
        }
	public static void main(String[] args) 
        {

	OccurenceofString o=new OccurenceofString();
	o.get();
	o.run();
	}
}