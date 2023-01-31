package assignment.shape;
import java.util.*;
import java.util.logging.*;
public class Shape
{
    float length;
    float breadth;
    float height;
    float width;
    float base;
    float side;
    float radius;
    float perimeter;
    double area;
    int shape;
    Logger log = Logger.getLogger("hi");

    Shape() {
        Scanner sc = new Scanner(System.in);
        log.info("Which shape you want to calculate from below\n1.Circle\n2.Rectangle\n3.Triangle");
        shape = sc.nextInt();
        switch (shape) {
            case 1:
                log.info("Enter Length");
                length = sc.nextInt();
                log.info("Enter Breadth");
                breadth = sc.nextInt();
                Perimeter();
                Area();
                break;

            case 2:
                log.info("Enter Base");
                base = sc.nextInt();
                log.info("Enter height");
                height = sc.nextInt();
                log.info("Enter side");
                side = sc.nextInt();
                Perimeter();
                Area();
                break;

            case 3:
                log.info("Enter radius");
                radius = sc.nextInt();
                Perimeter();
                Area();
                break;

            default:
                log.info("Entered invalid shape");
                break;

        }
	sc.close();
    }

    void Perimeter() {
        switch (shape) {
            case 1:
                perimeter = 2 * (length + breadth);
                log.fine("Permeter of Rectangle is {}" ,perimeter);
                break;

            case 2:
                perimeter = height + base + side;
                log.fine("Perimeter of Triangle is {}" ,perimeter);
                break;

            case 3:
                perimeter = 2 * 22 / 7 * radius;
                log.fine("Perimeter of Circle is {} " ,perimeter);
                break;
		
		default:
			log.info("Invalid");
			break;
        }
    }

    void Area() {
        switch (shape) {
            case 1:
                area = length * breadth;
                log.fine("Area of Rectangle is {}",area);
                break;

            case 2:
                area = .5 * (base * height);
                log.fine("Area of Triangle is {} " ,area);
                break;

            case 3:
                area = radius * radius;
                log.fine("Area of Circle is {}" ,area);
                break;
		
	    default:
		log.info("Invalid"};
		break;
        }
    }

    public static void main(String[] args) {
        Shape in = new Shape();

    }
}
