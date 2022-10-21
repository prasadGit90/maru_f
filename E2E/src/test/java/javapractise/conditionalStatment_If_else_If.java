package javapractise;


public class conditionalStatment_If_else_If {

	public static void main(String args[]) {
		
		int marks= 36;
		
		if (marks>85){
			System.out.println("Distanction");
		}
		else if(marks>75)
		{
			System.out.println("A grade");
		}
		else if (marks>65)
		{
			System.out.println("B Grade");
		}
		else if (marks>55)
		{
			System.out.println("c Grade");
		}
		else if(marks>45)
		{
			System.out.println("D Grade");
			
		}
		else if(marks>35)
		{
			System.out.println("Pass:E Grade");
		}
		else {
			System.out.println("Fail");
		}
	}
}
