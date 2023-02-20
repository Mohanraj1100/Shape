package assignment.shape;
import java.util.*;
import java.util.logging.*;
public class Shape
{
    public static void main(String[] args) {
    	int choice;
        Logger log = Logger.getLogger("hi");
        Scanner inputobj = new Scanner(System.in);
        log.info("Which shape you want to calculate from below\n1.Rectangle\n2.Triangle\n3.Circle");
        choice = inputobj.nextInt();
        ShapeCalculation sc = new ShapeCalculation(choice);
        sc.perimeterIs();
        sc.areaIs();
    }
}
class ShapeCalculation{
	double length;
    double breadth;
    double height;
    double width;
    double base;
    double side;
    double radius;
    double perimeter;
    double area;
    double pie=3.14;
    double half=0.5;
    int choice;
    Logger log = Logger.getLogger("hi");
    Scanner inputobj = new Scanner(System.in);
    ShapeCalculation(int choice){
    	this.choice = choice;
    	switch (choice) {
        case 1:
            log.info("Enter Length");
            length = inputobj.nextInt();
            log.info("Enter Breadth");
            breadth = inputobj.nextInt();
            break;

        case 2:
            log.info("Enter Base");
            base = inputobj.nextInt();
            log.info("Enter height");
            height = inputobj.nextInt();
            log.info("Enter side");
            side = inputobj.nextInt();
            break;

        case 3:
            log.info("Enter radius");
            radius = inputobj.nextInt();
            break;

        default:
            log.info("You have entered invalid shapename ");
            break;

    }
    	
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
}
