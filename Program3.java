//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
    public static void main(String[] args){
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = numScanner.nextInt();
        System.out.println("Enter the width: ");
        width = numScanner.nextInt();
        area = length*width;
        perimeter = 2*(length+width);
        System.out.println("The length is " + length);
        System.out.println("The width is " + width);
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
    }
}


//Paste console output below:
/*
Enter the length: 
25
Enter the width: 
32
The length is 25
The width is 32
The area is 800
The perimeter is 114

*/
