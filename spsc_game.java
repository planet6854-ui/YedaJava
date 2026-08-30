import java.util.Random;
import java.util.Scanner;
public class spsc_game{
    public static void main(String[] args){

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int computer = random.nextInt(3);
        int human ;
        int stone = 0;
        int paper = 1;
        int scissor = 2;
        int rounds;
        int botwon = 0;
        int bhonduwon = 0;
        int tie = 0;
        
        // Bhondu human chooses
        System.out.println("------- LETS PLAY!!! ------");
        System.out.println("                    ");
        System.out.println("===== HERE: =====");
        System.out.println("0: Stone");
        System.out.println("1: Paper");
        System.out.println("2: Scissor");

        System.out.print("How many rounds you want to play?? :");
        rounds = sc.nextInt();
        for(int i = 0 ; i < rounds ; i++){
            System.out.println("Choose:");
            human = sc.nextInt();
            switch (human) {
                case 0:
                    human = 0;
                    break;
                case 1:
                    human = 1;
                    break;
                case 2:
                    human = 2;
                    break;
                default:
                    System.out.println("Invalid!!!");
            }

            
            // Computer mahashay chooses
            switch (computer) {
                case 0:
                    computer = 0;
                    break;
                case 1:
                    computer = 1;
                    break;
                case 2:
                    computer = 2;
                    break;
                default:
                    System.out.println("Invalid!!!");
            }

            System.out.println("The computer chose:" + computer);
            System.out.println("The you chose:" +human);

            if(computer == human){
            System.out.println("Tie");
            tie = tie + 1;
            }
            else if(computer == 0 && human == 2){
                System.out.println("Computer wins");
                botwon = botwon + 1;
            }
            else if(computer == 1 && human == 0){
                System.out.println("Computer wins");
                botwon = botwon + 1;
            }
            else if(computer == 2 && human == 1){
                System.out.println("Computer wins");
                botwon = botwon + 1;
            }
            else{
                System.out.println("You won!!!");
                bhonduwon = bhonduwon + 1;
            }
        }

        // Dekhe zara kisme kitna hain dum
        System.out.println("                    ");
        System.out.println("----------- Result: -----------");
        System.out.println("                    ");
        System.out.println("Number of rounds You won : " +bhonduwon);
        System.out.println("Number of rounds Computer won : " +botwon);
        System.out.println("Number of ties : " +tie);
        System.out.println("                    ");
        System.out.println("                    ");
        System.out.println("----------------------------");
        if(bhonduwon > botwon){
            System.out.println("You are the winner!!!");
        }
        else if(bhonduwon == botwon){
            System.out.println("It's a tie...");
        }
        else{
            System.out.println("Computer is the winner!!!");
        }
        System.out.println("----------------------------");
    }
}