import java.util.Scanner;

public class tuition {
	
	public static void main(String[]args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Tuition Cost ");
		double initial_tuition = input.nextInt();
	
		double yearly_tuition = initial_tuition;
		double total_tuition = initial_tuition;
		
	
		
		for(int i=0;i<3;i++){
			
			System.out.println("Enter Percent Increase: ");
			double percent_increase = input.nextInt();
			
			
			yearly_tuition = yearly_tuition + (yearly_tuition*(percent_increase/100));
			total_tuition += yearly_tuition;
		
		}
		System.out.printf("Your Total Tuition Cost is: %.2f",total_tuition);
		
	}
}
