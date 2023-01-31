package assignment.shape;
import java.util.*;
import java.util.logging.*;
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
    String shapename;
    Logger log = Logger.getLogger("hi");

    Shape() {
        Scanner sc = new Scanner(System.in);
        log.info("Which shape you want to calculate from below\n1.Circle\n2.Rectangle\n3.Triangle");
        shapename = sc.nextLine();
        switch (shapename) {
            case "Rectangle":
                log.info("Enter Length");
                length = sc.nextInt();
                log.info("Enter Breadth");
                breadth = sc.nextInt();
                perimeter();
                area();
                break;

            case "Triangle":
                log.info("Enter Base");
                base = sc.nextInt();
                log.info("Enter height");
                height = sc.nextInt();
                log.info("Enter side");
                side = sc.nextInt();
                perimeter();
                area();
                break;

            case "Circle":
                log.info("Enter radius");
                radius = sc.nextInt();
                perimeter();
                area();
                break;

            default:
                log.info("Entered invalid shape");
                break;

        }
	sc.close();
    }

    void perimeter() {
        switch (shapename) {
            case "Rectangle":
                perimeter = 2 * (length + breadth);
                log.info("Permeter of Rectangle is" + perimeter);
                break;

            case "Triangle":
                perimeter = height + base + side;
                log.info("Perimeter of Triangle is" + perimeter);
                break;

            case "Circle":
                perimeter = 2 * 22 / 7 * radius;
                log.info("Perimeter of Circle is " + perimeter);
                break;
        }
    }

    void area() {
        switch (shapename) {
            case "Rectangle":
                area = length * breadth;
                log.info("Area of Rectangle" + area);
                break;

            case "Triangle":
                area = .5 * (base * height);
                log.info("Area of Triangle is " + area);
                break;

            case "Circle":
                area = radius * radius;
                log.info("Area of Circle is " + area);
                break;
        }
    }

    public static void main(String[] args) {
        Shape in = new Shape();

    }
}
