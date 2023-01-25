package assignment.shape;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Shape
{
	int length;
    int breadth;
    int height;
    int width;
    int base;
    int side;
    int radius;
    float perimeter;
    double area;
    String ShapeName;

    Shape() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which shape you want to calculate from below\n1.Circle\n2.Rectangle\n3.Triangle");
        ShapeName = sc.nextLine();
        switch (ShapeName) {
            case "Rectangle":
                System.out.println("Enter Length");
                length = sc.nextInt();
                System.out.println("Enter Breadth");
                breadth = sc.nextInt();
                Perimeter();
                Area();
                break;

            case "Triangle":
                System.out.println("Enter Base");
                base = sc.nextInt();
                System.out.println("Enter height");
                height = sc.nextInt();
                System.out.println("Enter side");
                side = sc.nextInt();
                Perimeter();
                Area();
                break;

            case "Circle":
                System.out.println("Enter radius");
                radius = sc.nextInt();
                Perimeter();
                Area();
                break;

            default:
                System.out.println("Entered invalid shape");
                break;

        }

    }

    void Perimeter() {
        switch (ShapeName) {
            case "Rectangle":
                perimeter = 2 * (length + breadth);
                System.out.println("Permeter of Rectangle is" + perimeter);
                break;

            case "Triangle":
                perimeter = height + base + side;
                System.out.println("Perimeter of Triangle is" + perimeter);
                break;

            case "Circle":
                perimeter = 2 * 22 / 7 * radius;
                System.out.println("Perimeter of Circle is " + perimeter);
                break;
        }
    }

    void Area() {
        switch (ShapeName) {
            case "Rectangle":
                area = length * breadth;
                System.out.println("Area of Rectangle" + area);
                break;

            case "Triangle":
                area = .5 * (base * height);
                System.out.println("Area of Triangle is " + area);
                break;

            case "Circle":
                area = radius * radius;
                System.out.println("Area of Circle is " + area);
                break;
        }
    }

    public static void main(String[] args) {
        Shape in = new Shape();

    }
}
