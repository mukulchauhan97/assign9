import java.io.*;
class Read
{
  public static void main(String args[])
{
  try
  {
    File f = new File("the.txt");
    FileWriter w = new FileWriter("mia.txt");
    String str;
    str=f.getAbsolutePath();
    w.write(str);
    w.close();
    System.out.println("complete");
  }
    catch(IOException e)
  {
    e.printStackTrace();
    }
  }
}