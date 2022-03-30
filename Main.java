import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // creat variables
    int r, 𝛼;
    double pi, circle;
    
    // get data from user
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter radius of the circle: ");
    r = input.nextInt();
    pi = 3.14;
    
    System.out.print("Enter an Angle: ");
    𝛼 = input.nextInt();
    circle = (pi * (r * r) * 𝛼) / 360;
    
    System.out.println("Area of a Circle: " + circle);
    
  }
}
