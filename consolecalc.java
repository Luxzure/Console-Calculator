import java.util.Scanner;

public class consolecalc{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("       CALCULATOR");
        System.out.println("=========================");
        
        System.out.print("\nEnter 1st number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        sc.nextLine();

        while(true){
        System.out.println("=========================");
        System.out.println("       OPERATIONS");
        System.out.println("\nA. Multiplication");
        System.out.println("B. Division");
        System.out.println("C. Addition");
        System.out.println("D. Subtraction");
        System.out.println("=========================");
        System.out.print("Choose an operation: ");
        String input = sc.nextLine().trim();
        

        if (input.length() == 0){
            System.out.println("Invalid Input!");
            continue;
        }
        
        char choice = input.toUpperCase().charAt(0);

        switch (choice) {
            case 'A':
                System.out.println("= " + (n1 * n2));
                break;
            case 'B':
                if (n2 == 0){
                    System.out.println("Error: Division by zero");
                } else{
                    System.out.println("= " + ((double) n1 / n2));
                }
                break;
            case 'C':
                System.out.println("= " + (n1 + n2));
                break;
            case 'D':
                System.out.println("= " + (n1 - n2));
                break;
            default:
                System.out.println("Invalid Input! Please choose A, B, C, or D");
        }
        
        System.out.print("Do you want to perform another operation? (y/n): ");
        String again = sc.nextLine().trim();
        if (again.equals("n")){
            break;
            }
        }
    sc.close();
    System.out.println("Exiting...");
    }
}
