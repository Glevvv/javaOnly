 /*
Give the user the following menu to choose from:

Make your choice
1. McDonald's Fries
2. McDonald's Big Mac
3. McDonald's Breakfast Muffin
4. Exit


/Read the choice of the user and display what he chose

/In this activity you can use the combination of "do while loop" and "switch statement"

/Read here for switch statment in java: https://www.w3schools.com/java/java_switch.asp
/Read here for do while loop in java: https://www.w3schools.com/java/java_while_loop.asp


*/
public class Menu {
    public static void main(String[] args) {
        int choice;
        
       
        do {
            System.out.println("\nMake your choice\n1. McDonald's Fries\r\n" + //
                "2. McDonald's Big Mac\r\n" + //
                "3. McDonald's Breakfast Muffin\r\n" + //
                "4. Exit\n");
            choice = Integer.parseInt(System.console().readLine());
           // complete the switch statement
            switch (args) {
                case value:
                    
                    break;
            
                default:
                    break;
            }

        } while (choice != 4);

    }
}


