import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        
        double areaCm = 0.5 * base * height;
        // 1 inch = 2.54 cm, so 1 sq inch = 2.54 * 2.54 sq cm
        double areaInches = areaCm / (2.54 * 2.54);
        
        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
        
        input.close();
    }
}