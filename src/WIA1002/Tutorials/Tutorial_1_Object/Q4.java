package WIA1002.Tutorials.Tutorial_1_Object;

public class Q4 {
    public static void main(String[] args) {
        Car bmw = new Car(100);

        System.out.println("Max Speed: " + bmw.getMaxSpeed());
        bmw.pedalToTheMetal();
        System.out.println("Final Speed: " + bmw.getCurrentSpeed());
    }

    // Vehicle abstract class
    abstract static class Vehicle {
        private double maxSpeed;
        protected double currentSpeed;

        Vehicle(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            this.currentSpeed = 0;
        }

        // Abstract method accelerate (must be implemented by subclasses)
        public abstract void accelerate();

        public double getMaxSpeed() {
            return this.maxSpeed;
        }

        public double getCurrentSpeed() {
            return this.currentSpeed;
        }

        // Method to repeatedly call accelerate until currentSpeed reaches maxSpeed
        public void pedalToTheMetal() {
            while (currentSpeed < maxSpeed) {
                accelerate(); // Call the accelerate method (subclass-defined)
                // Ensure we don't exceed maxSpeed
                if (currentSpeed > maxSpeed) {
                    currentSpeed = maxSpeed;
                }
            }
        }
    }

    // Car class
    static class Car extends Vehicle {
        Car(double maxSpeed) {
            super(maxSpeed);
        }

        @Override
        public void accelerate() {
            currentSpeed += 10;
            System.out.println("Current speed => " + currentSpeed);
        }
    }
}
