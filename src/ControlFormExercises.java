import java.util.Scanner;

public class ControlFormExercises {
    public static void main(String[] args){
        //1A
        int i = 5;
        while (i <= 15){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println("");
        //1B
        int count2s = 0;
        do {
            count2s += 2;
            System.out.println(count2s);
        } while (count2s < 100);

         int minus5 = 100;
        do {
            minus5 -= 5;
            System.out.println(minus5);
        } while (minus5 > -10);

        long squareResult = 2;
        do {
            System.out.println(squareResult);
            squareResult *= squareResult;
            if (squareResult > 1000000){
                break;
            }
        } while (squareResult < 1000000);

        //1C
        for (int j = 5; j <= 15; j++){
            System.out.print(j + " ");
        }

        for (int count2sFor = 0; count2sFor <= 100; count2sFor += 2){
            System.out.println(count2sFor);
        }

        for (int minus5For = 100; minus5For >=- 10; minus5For -= 5){
            System.out.println(minus5For);
        }

        for (long squareResultFor = 2; squareResultFor < 1000000; squareResultFor *= squareResultFor){
            System.out.println(squareResultFor);
        }

        //2
        for (int x = 1; x <= 100; x++){
            if ((x % 3 == 0) && (x % 5 == 0)){
                System.out.println("FizzBuzz");
            }else if (x % 3 == 0){
                System.out.println("Fizz");
            }else if (x % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(x);
            }
        }

        //3
        boolean powersTable = true;
        do {
            System.out.println("Please enter an Integer");
            Scanner scan = new Scanner(System.in);
            int userInteger = scan.nextInt();
            System.out.println("number | square | cubed");
            System.out.println("-------|--------|------");
            for (int y = 1; y <= userInteger; y++){
                System.out.printf("%s      |%s       |%s \n",y, y*y, y*y*y);
            }
            System.out.println("Would you like to go again? [Y/N]");
            String userInput = scan.next();
            boolean userConfirmPower = userInput.equalsIgnoreCase("y");
            if (userConfirmPower == false){
                powersTable = false;
            }
        } while (powersTable);

        boolean grading = true;
        do {
            System.out.println("Enter a numerical grade via integer from 0-100");
            Scanner gradeInput = new Scanner(System.in);
            int numericalGrade = gradeInput.nextInt();
            if(numericalGrade <= 100 && numericalGrade >= 88){
                switch (numericalGrade){
                    case 100:
                    case 99:
                        System.out.println("A+");
                        break;
                    case 89:
                    case 88:
                        System.out.println("A-");
                        break;
                    default:
                        System.out.println("A");
                }
            } else if (numericalGrade <= 87 && numericalGrade >= 80){
                switch (numericalGrade){
                    case 87:
                    case 86:
                        System.out.println("B+");
                        break;
                    case 81:
                    case 80:
                        System.out.println("B-");
                        break;
                    default:
                        System.out.println("B");
                }
            } else if (numericalGrade <= 79 && numericalGrade >= 67){
                switch (numericalGrade){
                    case 79:
                    case 78:
                        System.out.println("C+");
                        break;
                    case 68:
                    case 67:
                        System.out.println("C-");
                        break;
                    default:
                        System.out.println("C");
                }
            } else if (numericalGrade <= 66 && numericalGrade >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to go again? [Y/N]");
            String userInput = gradeInput.next();
            boolean userConfirmGrades = userInput.equalsIgnoreCase("y");
            if (userConfirmGrades == false){
                grading = false;
            }
        } while (grading);

    }
}
