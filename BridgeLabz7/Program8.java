import java.util.Scanner;

public class Program8{
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
		int physics=sc.nextInt();
		
		int chemistry=sc.nextInt();
		int math=sc.nextInt();
		
		int sum=physics+chemistry+math;

		int percentage=(sum*100)/300;
		
		int avg=sum/3;
		
		if(percentage<=39){
			System.out.println("Average marks are: "+avg);
			System.out.println("Grade: "+"R");
			System.out.println("Remarks: "+"Remidial standards");
		}
		else if(percentage>=40&&percentage<=49){
			System.out.println("Average marks are: "+avg);
			System.out.println("Grade: "+"E");
			System.out.println("Remarks: "+"Level 1-,too below agency-normalized standards ");
		}
		else if(percentage>=50&&percentage<=59){
			System.out.println("Average marks are: "+avg);
			System.out.println("Grade: "+"D");
			System.out.println("Remarks: "+"level 1 ,well below agency-normalized standards ");
		}
		else if(percentage>=60&&percentage<=69){
			System.out.println("Average marks are: "+avg);
			System.out.println("Grade: "+"C");
			System.out.println("Remarks: "+"level 2 ,below, but approaching agency-normalized standards ");
		}
		else if(percentage>=70&&percentage<=79){
			System.out.println("Average marks are: "+avg);
			System.out.println("Grade: "+"B");
			System.out.println("Remarks: "+"level 3, at agency-normalized standards ");
		}
		else{
			System.out.println("Average marks are: "+avg);
			System.out.println("Grade: "+"A");
			System.out.println("Remarks: "+"level 4,above agency-normalized standards ");
			
		}
    }
}