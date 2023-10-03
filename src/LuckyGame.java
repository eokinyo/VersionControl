import java.util.Random; //To import the random number generator utility

public class LuckyGame {

	public static void main(String[] args) {
		
		int playerMoney = 5; //The initial amount of money in € that the player has.
        Random random = new Random();
        
        while (playerMoney > 0) {
            // Step 1: Generate and display three random numbers between 1 and 10
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int num3 = random.nextInt(10) + 1;
            
            System.out.println("Random numbers: " + num1 + ", " + num2 + " and " + num3);
            
         // Check if one of the numbers is 7
            if (num1 == 7 || num2 == 7 || num3 == 7){
                // Step 2: Update player's money based on the winning formula
                if (num1 == 7 && num2 == 7 && num3 == 7) {
                    playerMoney += 10;
                    System.out.println("You won 10€!");
                } else if (num1 == 7 && num2 == 7 || num1 == 7 && num3 == 7 || num2 == 7 && num3 == 7) {
                    playerMoney += 5;
                    System.out.println("You won 5€!");
                } else {
                    playerMoney += 3;
                    System.out.println("You won 3€!");
                }
            } 
            //If none of the numbers is 7, the player loses 1€ as below
            else {
                playerMoney -= 1;
                System.out.println("You lost 1€.");
            }
            
            System.out.println("Current balance: " + playerMoney + "€\n");
        }

	}

}
