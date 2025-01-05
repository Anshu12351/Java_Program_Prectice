import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=4;
		//square-Fill-pattern
		//*-------------------------*//
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print("");
			}
			for(int j=0;j<=n;j++) {
			
			System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		//square-Hollow-pattern
		System.out.println();
		//*-------------------------*//
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print("");
			}
			for(int j=0;j<=n;j++) {
			if(i==0||j==0||i==n||j==n) {
			System.out.print("*"+" ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
		
		
		//Right-Half-Pyramid
		System.out.println();
		//*-------------------------*//
		
		
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("");
			}
			for(int j=0;j<=i;j++) {
			
			System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		//Revers-Right-Half-Pyramid
		System.out.println();
		//*-------------------------*//
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("");
			}
			for(int j=i;j<=n;j++) {
			
			System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		//Left-Half-Pyramid
		System.out.println();
		//*-------------------------*//
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) {
			
			System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		//Reverse-left-Half-Pyramid
		System.out.println();
		//*-------------------------*//
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("");
			}
			for(int j=i;j<=n;j++) {
			
			System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		//Triangle-Star-Pattern
		System.out.println();
		//*-------------------------*//
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
			
			System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		//Reverse-Triangle-Star-Pattern
		System.out.println();
		//*-------------------------*//
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
			
			System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		//Hollow-Triangle-Star-Pattern
		System.out.println();
		//*-------------------------*//
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
			if(i==0||j==0||i==j||j==i||i==n||j==n) {
			System.out.print("*"+" ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
		
		
		//Reverse-Hollow-Triangle-Star-Pattern
		System.out.println();
		//*-------------------------*//
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
			if(i==0||j==0||i==j||j==i||i==n||j==n) {
			System.out.print("*"+" ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println();
		}
	}

}