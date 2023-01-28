package firstjava;

import java.util.Scanner;

public class GradesCounterControlledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int score;
	char grade;
	int counter = 1;

	while (counter <= 10) {
	
	Scanner tool = new Scanner(System.in);
	
	System.out.print("enter int score");
	score = tool.nextInt();
	
	if (score >= 90)
    {
       grade = 'A';
    }
    else if (score >= 80)
    {
       grade = 'B';
    }
    else if (score >= 70)
    {
       grade = 'C';
    }
    else if (score >= 50)
    {
       grade = 'D';
    }
    else
    {
       grade = 'F';
    }
	
	
	System.out.println("grade is " + grade);
	counter++;
	}}
}



