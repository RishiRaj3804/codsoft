import java.util.Scanner;
public class gradecalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Step 1: Take input for marks obtained in each subject
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();
            int totalMarks = 0;
    
            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + i + ": ");
                int marks = scanner.nextInt();
                totalMarks += marks;
            }
    
            // Step 2: Calculate the total marks
            double averagePercentage = (double) totalMarks / (numSubjects * 100);
    
            // Step 3: Calculate the average percentage
            // Step 4: Assign grades based on the average percentage achieved
            char grade;
    
            if (averagePercentage >= 0.9) {
                grade = 'A';
            } else if (averagePercentage >= 0.8) {
                grade = 'B';
            } else if (averagePercentage >= 0.7) {
                grade = 'C';
            } else if (averagePercentage >= 0.6) {
                grade = 'D';
            } else {
                grade = 'F';
            }
    
            // Step 5: Display the results
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + (averagePercentage * 100) + "%");
            System.out.println("Grade: " + grade);
    
            scanner.close();
        }
    }
    
    

