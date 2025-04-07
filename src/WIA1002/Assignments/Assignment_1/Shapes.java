package WIA1002.Assignments.Assignment_1;

/*
    ----------
    Group 35 
    Group Members:
    --------------
      1. Nur Izzah Farzana Binti Mohd Razli (23002748)
      2. Nur Husna Binti Muhammad Ridzwan (24004494)
      3. MD. RAIYAN TAKRIM	(23106816)
      4. Tanvir Hossain (23121478)
      5. SAIEKT DAS (22117847)
      6. KHAN SAFWAN HASAN	(23094615)
*/

// Shape abstract class
abstract class Shape {
    abstract public double calculateVolume();

    abstract public double calculateSurface();
}

// Sphere class
class Sphere extends Shape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        double volume = (4 * Math.PI * Math.pow(radius, 3) / 3);
        return volume;
    }

    @Override
    public double calculateSurface() {
        double area = (4 * Math.PI * Math.pow(radius, 2));
        return area;
    }
}

// Cylinder class
class Cylinder extends Shape {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        double volume = (Math.PI * Math.pow(radius, 2) * height);
        return volume;
    }

    @Override
    public double calculateSurface() {
        double area = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
        return area;
    }

}

// Cone class
class Cone extends Shape {
    private double radius;
    private double height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        double volume = (Math.PI * Math.pow(radius, 2) * height) / 3;
        return volume;
    }

    @Override
    public double calculateSurface() {
        // Calculate slant height (l)
        double slantHeight = Math.sqrt((Math.pow(radius, 2) + Math.pow(height, 2)));
        double area = (Math.PI * Math.pow(radius, 2)) + (Math.PI * radius * slantHeight);
        return area;
    }

}

// Main method
public class Shapes {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cone cone = new Cone(5, 10);
        Cylinder cylinder = new Cylinder(5, 10);

        System.out.printf("Sphere Volume: %.4f\n", sphere.calculateVolume());
        System.out.printf("Sphere Surface Area: %.4f\n", sphere.calculateSurface());

        System.out.printf("Cylinder Volume: %.4f\n", cylinder.calculateVolume());
        System.out.printf("Cylinder Surface Area: %.4f\n", cylinder.calculateSurface());

        System.out.printf("Cone Volume: %.4f\n", cone.calculateVolume());
        System.out.printf("Cone Surface Area: %.4f\n", cone.calculateSurface());
    }
}
