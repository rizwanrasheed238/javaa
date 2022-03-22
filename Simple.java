import java.io.*;
public class Simple
{int x;

 public static void main(String args[])throws IOException
 {
	 BufferedReader br=new BufferedReader(InputStreamReader(System.in));
   System.out.println("helloworld");
  x=Integer.ParseInt(br.readLine());
  Simple ob=new Simple();
	System.out.println(ob.x);
}
}	