// STUDENT GRADE CALCULATOR

// TASK 2

import java.util.Scanner;
public class studentGradecalculator {
    public static void main(String[] args) {
        int totalMarks = 0;
        int[] marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.of subjects");
        int numberofsubjects = sc.nextInt();
        marks = new int[numberofsubjects];
        for(int s =0; s<numberofsubjects;s++){
            System.out.printf("enter the marks %d out of  100  \n",s+1);
            marks[s]= sc.nextInt();
            totalMarks += marks[s];
        }
        System.out.println("total marks :"+totalMarks );
        float averagePercentageOfallsubject = (float) (totalMarks / (numberofsubjects * 100.0) * 100.0);
        System.out.println("the average percentage of all subjects: \n" +averagePercentageOfallsubject+ "%");
        if(averagePercentageOfallsubject<60.f){
            System.out.println("your grade is : B ");
        }else if (averagePercentageOfallsubject>=60.f &&averagePercentageOfallsubject<70.f){
            System.out.println("your grade is : A ");
        }else if (averagePercentageOfallsubject >=70.f && averagePercentageOfallsubject<90.f){
            System.out.println("your grade is : A+ ");
        }else{
            System.out.println("your grade is : A++ ");
        }


    }
}