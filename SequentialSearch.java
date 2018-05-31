import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequentialSearch {

	
	public static void main(String[] args) {
		
		//List to dynamically store input numbers
		List<Integer> numbers = new ArrayList<Integer>();
		//Scanner to accept numbers
		Scanner sc = new Scanner(System.in);
		//Delimiter to specify the end of line 
		sc.useDelimiter(System.getProperty("line.separator"));
		int n = 0;
		System.out.println("Please Enter integers");
		//Accepting input till pressed enter twice
		while(sc.hasNextInt())
		{
			n = sc.nextInt();
			numbers.add(n);
		}
		//Scanner is reset because we used sc.useDelimiter, it would give an IllegalNumberexception if reset() not used
		sc.reset();
		int searchNumber=0;
		
		System.out.print("Enter a Number to search :");
		searchNumber = sc.nextInt();
				
		int i =0;
		//Searching through the number List for the searchNumber
		while((i<numbers.size()) && (searchNumber != numbers.get(i)) ){
			i++;
		}
		//If the number is found we print the number and the position else we print "Number not present"
		if(i<numbers.size()){
			System.out.println("Number: "+ numbers.get(i) +" is present at " + i + " Position ");
		}else{
			System.out.println("Number not present ");
		}
		//We close the scanner
		sc.close();
	}
	

}
