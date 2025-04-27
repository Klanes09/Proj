import java.util.Scanner;

public class CarDemo{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Input year: ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.print("Input model (SEDAN, SUV, TRUCK, CONVERTABLE, HATCHBACK): ");
        String b = scan.nextLine().toUpperCase();
        System.out.print("Input color (RED, BLUE, GREEN, YELLOW, BLACK, PURPLE): ");
        String c = scan.nextLine().toUpperCase();
        
        Car car1 = new Car(a, Model.ModelType.valueOf(b), Color.ColorType.valueOf(c));
        
        System.out.println("\nYear: " +car1.getYear() + " Model: "+ car1.getModel() + " Color: " + car1.getColor());
    }
}

class Color{
    enum ColorType {
        RED, BLUE, GREEN, YELLOW, BLACK, PURPLE
    }
}

class Model{
    enum ModelType {
        SEDAN, SUV, TRUCK, CONVERTABLE, HATCHBACK
    }
}

class Car {
    private int year;
    private Model.ModelType model;
    private Color.ColorType color;

    public Car(int year, Model.ModelType model, Color.ColorType color) { 
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model.toString();
    }

    public String getColor() {
        return color.toString();
    }
}