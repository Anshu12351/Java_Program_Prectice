           //---------------> Fibonacci series <----------------

package javaProgram;
import java.util.*;
public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        int a=0, b=1;
        System.out.println(a+"\n"+b);
        int n=10;
        for(int i=0;i<=n;i++) {
        	int c=a+b;
        	System.out.println(c);
        	a=b;
        	b=c;
        }
        
	}

}
