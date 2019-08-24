package learn;

import java.util.Scanner;

public class DiamondDesignApp {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter cross-sectional length (must be an odd number), of the diamond or -1 to quit ");
		int length=input.nextInt();
		while(length!=-1&&length%2!=0){
			for(int i=1;i<=length;i+=2){
				for(int j=length;j>i;j-=2)
				System.out.print(" ");
				for(int k=1;k<=i;k++)
					System.out.print("*");
				for(int j=length;j>i;j-=2)
					System.out.print(" ");
				System.out.println();
					
			}
			for(int j=length-2;j>=1;j-=2){
				for(int k=length;k>j;k-=2)
					System.out.print(" ");
				for(int k=1;k<=j;k++)
					System.out.print("*");
				for(int k=length;k>j;k-=2)
					System.out.print(" ");
				System.out.println();
				
			}
			System.out.println("Enter cross-sectional length (must be an odd number), of the diamond or -1 to quit ");
			 length=input.nextInt();

			}
		System.out.print("Bye!");
		}

	}


