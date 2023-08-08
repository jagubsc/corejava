package firstpackage;

import java.util.Scanner;

public class Alternativeprintloop {
	public void Alternate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int start= sc.nextInt();
		System.out.println("Enter the ending number");
		int end= sc.nextInt();
		
		for(int i=start;i>=end;i=i-2) {
			System.out.println(i);
			
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Alternativeprintloop loop =new Alternativeprintloop();
      loop.Alternate();
	}

}
