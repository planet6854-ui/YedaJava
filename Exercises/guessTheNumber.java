package Exercises;
import java.util.Random;
import java.util.Scanner;

class Game{
    private int randomNumber;
    private int userInput;
    private int noOfGuess;
    private int range;
    
    // Constructor 
    public Game() {
        noOfGuess = 0;
    }

    // Range of guess
    public void rangeOfGuess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number till where you want to guess: ");
        range = sc.nextInt();
        Random random = new Random();  // Initializing that random number
        randomNumber = random.nextInt(range)+1; // Getting that random number 
    }

    // Taking input from the user
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number you guessed: ");
        userInput = sc.nextInt();
    }

    // Checking if its correct
    public boolean isCorrectNumber(){
        noOfGuess++;

        if(userInput == randomNumber){
            System.out.println("Yes!! You guessed the right number...");
            return true;
        }
        else if(userInput < randomNumber){
            System.out.println("The guessed number is a lil bit lower...");
        }
        else{
            System.out.println("The guessed number is a lil bit higher...");
        }

        return false;
    }

    public int getnoOfGuesses(){
        return noOfGuess;
    }

    public void setnoOfGuess(int noOfGuess){
        this.noOfGuess = noOfGuess;
    }

    public static void main(String[] args) {
        Game game = new Game();
        boolean correct = false;
        game.rangeOfGuess();
        
        while(!correct){
            game.takeUserInput();
            correct = game.isCorrectNumber();
        }

        System.out.println("Your number of guesses required is: " +game.noOfGuess);
    }
}