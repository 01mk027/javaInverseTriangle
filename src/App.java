import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Defining variables and creating instance of Scanner class
        int numberOfHorizontalLines = 0, numberOfSpaces = 0, numberOfStars = 0;
        Scanner input = new Scanner(System.in);
        //Getting value
        System.out.println("Enter number of lines: ");
        numberOfHorizontalLines = input.nextInt();
        //Construction of lines
        for (int i = numberOfHorizontalLines; i > 0 ; i--) {
            //Printing spaces in correct order.
            for(int k=0; k<numberOfHorizontalLines - i; k++)
            {
                System.out.print(" ");
            }
            //Printing stars in correct order.
            for(int j=0; j< (2*i) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
