package assignment1;

import java.util.Scanner;

/**
 * This application gets 5 grades for user, assigns it a letter grade value and calculates the average of the 5 grades.
 * @date Sept 27, 2017
 * @author Keon Muellerchen
 */
public class Assignment1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //asks user to input grade
        System.out.print("Please enter a grade: ");
        int grade1 = keyboard.nextInt();
        System.out.print("Please enter a grade: ");
        int grade2 = keyboard.nextInt();       
        System.out.print("Please enter a grade: ");
        int grade3 = keyboard.nextInt();        
        System.out.print("Please enter a grade: ");
        int grade4 = keyboard.nextInt();       
        System.out.print("Please enter a grade: ");
        int grade5 = keyboard.nextInt();
        
        float averageMark = average(grade1, grade2, grade3, grade4, grade5);   
        
        //outputs the results to the user
        System.out.printf("The mark for the first course was %d%%, the letter grade is %s.", grade1, letterGrades(grade1));
        System.out.printf("\nThe mark for the second course was %d%%, the letter grade is %s.", grade2, letterGrades(grade2));
        System.out.printf("\nThe mark for the third course was %d%%, the letter grade is %s.", grade3, letterGrades(grade3));
        System.out.printf("\nThe mark for the fourth course was %d%%, the letter grade is %s.", grade4, letterGrades(grade4));
        System.out.printf("\nThe mark for the fifth course was %d%%, the letter grade is %s.", grade5, letterGrades(grade5));
        
        System.out.printf("\nThe overall average mark is %.1f%%, which is a letter grade of %s.\n", averageMark, letterGrades((int) averageMark));
    }//end of main
   
    /**
     * This method will take the grade and assigns it a letter grade.
     */
    public static String letterGrades(int grade)
    {
     if (grade >= 80 && grade <= 100)
            return "A";
        else if (grade >= 70 && grade <= 79)
            return "B";
        else if (grade >= 60 && grade <= 69)
            return "C";
        else if (grade >= 50 && grade <= 59)
            return "D";
        else
            return "F";     
    }//end of letterGrades

    /**
     * This method will calculate the average of the 5 grades.
     */
    public static float average(int g1, int g2, int g3, int g4, int g5)
    {
        return (g1+g2+g3+g4+g5)/5;  //formula for calculating the average
    }//end of average
}//end of Assignment1