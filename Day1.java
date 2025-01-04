import java.util.*;
public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //All Airthmatic Operations
	    Scanner sc= new Scanner(System.in);
	    int num1=sc.nextInt();
		System.out.print("Enter The Second Number = ");
		int num2=sc.nextInt();
		int add=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		float div=num1/num2;
		int mod=num1%num2;
		System.out.println(num1+"+"+num2+" = "+add);
		System.out.println(num1+"-"+num2+" = "+sub);
		System.out.println(num1+"*"+num2+" = "+mul);
		System.out.println(num1+"/"+num2+" = "+div);
		System.out.println(num1+"%"+num2+" = "+mod);
		
	}

}
