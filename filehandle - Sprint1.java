package lok.jav.filehandling;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class filehandle {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("array queue test\n");
		System.out.println("enter size of intiger queue");
		int n = scan.nextInt();
		
		Arrays q = new arrayQueue(n);
		File file = new File(" C:\\Users\\dell\\Desktop\\gitfiles");
		
		char ch;
		do {
			System.out.println("\nQueue Opratins");
			System.out.println("1. insert");
			System.out.println("2. delete");
			System.out.println("3. search");
			System.out.println("5. exit");
			int choice  = scan.nextInt();
			
			switch (choice)
			{
			case 1 :
				System.out.println("Enter name to insert: user specified file name");
				try
				{
					q.insert( scan.nextInt() );
					
				}
				catch(Exception e)
				{
					System.out.println(" Error: " +e.getMessage());
				}
				break;
			case 2 :
				System.out.println("Enter deletebale file name ");
				try
				{
					q.delete( scan.nextInt() );
					
				}
				catch(Exception e)
				{
					System.out.println(" Error: " +e.getMessage());
				}
				break;
			case 3 :
				System.out.println("Enter search file name ");
				try
				{
					q.getName( scan.nextInt() );
					
				}
				catch(Exception e)
				{
					System.out.println(" Error: " +e.getMessage());
				}
				break;
			case 5 :
				System.out.println("Enter do you want to exit ");
				try
				{
					q.exit();
					System.exit(scan.nextInt() ) ;
					
				}
				catch(Exception e)
				{
					System.out.println(" Error: " +e.getMessage());
				}
				break;
				
			}
			
			
				
			
			
		}
		
		
		
				
		
		
	}

}
