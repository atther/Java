import java.io.*;
class Number
{
    public static void main(String[] args) throws IOException
  {
	int num1,num2,result;
	String s1,s2;
	//Addition of two numbers inputted from keyboard   
	BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter two numbers :");
	s1=obj.readLine();
	s2=obj.readLine();
	num1=Integer.parseInt(s1);
	num2=Integer.parseInt(s2);
	result=num1+num2;
	System.out.print("Addition of two numbers is : ");	
	System.out.println(result);
       
  }
}
