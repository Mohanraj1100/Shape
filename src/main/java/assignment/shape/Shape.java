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
    float area;
    float pie=22/7;
    float half=1/2;	
    int choice;
    Logger log = Logger.getLogger("hi");

    Shape() {
        Scanner sc = new Scanner(System.in);
        log.info("Which shape you want to calculate from below\n1.Rectangle\n2.Triangle\n3.Circle");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                log.info("Enter Length");
                length = sc.nextInt();
                log.info("Enter Breadth");
                breadth = sc.nextInt();
                perimeterIs();
                areaIs();
		break;

            case 2:
                log.info("Enter Base");
                base = sc.nextInt();
                log.info("Enter height");
                height = sc.nextInt();
                log.info("Enter side");
                side = sc.nextInt();
                perimeterIs();
                areaIs();
                break;

            case 3:
                log.info("Enter radius");
                radius = sc.nextInt();
                perimeterIs();
                areaIs();
                break;

            default:
                log.info("Entered invalid shape");
                break;

        }
	sc.close();
    }

    void perimeterIs() {
        switch (choice) {
            case 1:
                perimeter = 2 * (length + breadth);
                log.log(Level.INFO,()->"Permeter of Rectangle is" +perimeter);
                break;

            case 2:
                perimeter = height + base + side;
                log.log(Level.INFO,()->"Permeter of Triangle is" +perimeter);
                
                break;

            case 3:
                perimeter = 2 * pie * radius;
                log.log(Level.INFO,()->"Permeter of Circle is" +perimeter);
                break;
		
		default:
			log.info("Invalid");
			break;
        }
    }

    void areaIs() {
        switch (choice) {
            case 1:
                area = length * breadth;
                log.log(Level.INFO,()->"Area of Rectangle is"+area);
                break;

            case 2:
                area = half * (base * height);
                log.log(Level.INFO,()->"Area of Triangle is"+area);
                break;

            case 3:
                area = radius * radius;
                log.log(Level.INFO,()->"Area of Circle is"+area);
                break;
		
            default:
            	log.info("Invalid");
            	break;
        }
    }
	
    void display()
    {
	    log.info(" Area and Perimeter has been calculated for the Particular Shape");
    }

    public static void main(String[] args) {
        Shape in = new Shape();
	in.display();

    }
}
