import java.util.Scanner;

class big_number
{
public static void main(String args[])
{
    int max;
    Scanner sc = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter fist number: ");
    int a = sc.nextInt();
    
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    
    max = (a > b) ? a : b;
    System.out.println("Largest number between " + a +" and " + b + " is " + max + ". " );
}
}




