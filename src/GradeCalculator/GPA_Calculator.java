package GradeCalculator;

import java.util.Scanner;

public  class GPA_Calculator {

    public static void getGPA(){
        Scanner takeInput = new Scanner(System.in);

        boolean validCredit = false;
        boolean validGrade = true;
        Integer credit= 0;
        Integer finalGPA=0;
        Integer points =0;
        Integer gradeValue = 0;

        do {
            validCredit = true;
            System.out.println("Enter your credit: ");
            String creditString = takeInput.nextLine();

            try {
                credit = Integer.parseInt(creditString);

            }catch (NumberFormatException e){
                System.out.println("Please enter a valid integer!");
                validCredit = false;
            }

        }while (!validCredit);


        do{

            validGrade = true;
            System.out.println("Enter your grade: ");
            String grade = takeInput.nextLine();

            if(grade.equalsIgnoreCase("A") || grade.equalsIgnoreCase("a")){
                gradeValue = 4;
            }else  if(grade.equalsIgnoreCase("B")|| grade.equalsIgnoreCase("b")){
                gradeValue = 3;
            }else  if(grade.equalsIgnoreCase("C")|| grade.equalsIgnoreCase("c")){
                gradeValue = 2;
            }else  if(grade.equalsIgnoreCase("D")|| grade.equalsIgnoreCase("d")){
                gradeValue = 1;
            }else  if(grade.equalsIgnoreCase("F")|| grade.equalsIgnoreCase("f")){
                gradeValue = 0;
            }else{
                System.out.println("Sorry! You've entered an invalid grade :(");
                validGrade = false;
            }
        }while (!validGrade);


        points = gradeValue * credit;
        finalGPA = points/credit;

        System.out.println("Credit value: "+ credit);
        System.out.println("Grade value: "+ gradeValue);
        System.out.println("Grade Point: "+ points);
        System.out.println("GPA Point: "+ finalGPA);

    }
}


