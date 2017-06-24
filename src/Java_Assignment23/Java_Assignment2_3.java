package Java_Assignment23;
/*
 * This class will print the “X” pattern:
*/

public class Java_Assignment2_3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//declaring all the variables 
		 int x=5;
		 char[] chars = new char[x];
		 
		 //Below for loop is used to design the X patern
		 for (int i = 0; i < x; i++) 
		 {
			 chars[i] = '*';
			 chars[x - 1 - i] = '*';
			 
			 //Nested for loop for designing the "-" filling in the patern
			 for (int j = 0; j < x; j++) 
			 {
				 if (j == i || j == (x - 1 - i)) 
				 {
					 continue;
				 }
				 chars[j] = '-';
			 }
			 // Printing the line
			 System.out.println(new String(chars));
		 }

	}
}
