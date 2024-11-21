import java.util.Scanner;

public class RandomNumber {

    //need to generate a random number
    //need to take user input

   private int randomNum;
    private int userInput;

    public RandomNumber(){
        random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your desired number : ");
        System.out.println();
        userInput = sc.nextInt();

        System.out.println("Comparing...");

        compare(randomNum, userInput);
        System.out.println("Your Number : " + userInput);
        System.out.println("Generated number : " + randomNum);
    }

    public int random(){
        int max = 100;
        int min = 1;
        int range = max-min+1;

        for(int i =0; i < 100; i++){
            randomNum = (int)(Math.random()*range) + min;
        }
        return randomNum;
    }

    public void compare(int randomNum, int userInput){
        if(userInput >= randomNum) System.out.println("Too high");
        else if(userInput == randomNum) System.out.println("Correct answer");
        else System.out.println("Too low");

    }

















}
