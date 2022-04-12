import java.util.*;

class rock_paper_scissors_game {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("****Welcome User to the game****\n- For Rock Enter (0) \n - For Paper Enter (1) \n - For Scissor Enter (2) \n Your Choice : ");
        Random choice = new Random();
        int user_input = 0;
        user_input = sc.nextInt();
        
        int random_choice = choice.nextInt(2);
        System.out.println("System's  Choice : " + random_choice);

        // jeeto code
        if (user_input == 0 && random_choice == 1 
        || user_input == 1 && random_choice == 0 
        || user_input == 2 && random_choice == 1) {
            System.out.println("JEET GYA !");
        }

        // tie code
        else if (user_input == 0 && random_choice == 0 
        || user_input == 1 && random_choice == 1 
        || user_input == 2 && random_choice == 2) {
            System.out.println("Draw !");
        }

        // galat input code
        else if (user_input >= 3) {
            System.out.println("Enter the correct one !");
        }

        // haaro code
        else {
            System.out.println("HAAR GYA !");
        }
    }
}