import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        int r,a;
        double area, perımeter, circleSliceArea , π=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        r = input.nextInt();
        System.out.print("Enter the measure of center angle : ");
        a = input.nextInt();

        area = (π*r*r);
        perımeter = (2*π*r);
        circleSliceArea = (π*r*r*a)/360;

        System.out.println("Area :" + area );
        System.out.println("Perımeter :" + perımeter );
        System.out.println("CircleSliceArea :" + circleSliceArea );




    }
}
