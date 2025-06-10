package WIA1002.Tutorials.Tutorial_1_Object;

public class Q1 {
    public static void main(String[] args) {
        Telephone telephone1 = new Telephone(03, 79676300);
        Telephone telephone2 = new Telephone(03, 79676301);
        Telephone telephone3 = new Telephone(03, 79676302);
        Telephone telephone4 = new Telephone(03, 79676303);
        Telephone telephone5 = new Telephone(03, 79676304);

        System.out.println(telephone1.makeFullNumber());
        System.out.println(telephone2.makeFullNumber());
        System.out.println(telephone3.makeFullNumber());
        System.out.println(telephone4.makeFullNumber());
        System.out.println(telephone5.makeFullNumber());

        System.out.println("Total Telephone objects created: " + Telephone.getNumberOfTelephoneObject());
    }

    // Telephone Class
    static class Telephone {
        protected int areaCode;
        protected int number;
        private static int numberOfTelephoneObject = 0;

        // Constructor
        Telephone(int areaCode, int number) {
            setAreaCode(areaCode);
            setNumber(number);
            numberOfTelephoneObject++;
        }

        // Mutator
        void setAreaCode(int areaCode) {
            this.areaCode = areaCode;
        }

        void setNumber(int number) {
            this.number = number;
        }

        // Accessor
        int getAreaCode() {
            return this.areaCode;
        }

        int getNumber() {
            return this.number;
        }

        static int getNumberOfTelephoneObject() {
            return numberOfTelephoneObject;
        }

        String makeFullNumber() {
            return "+" + this.getAreaCode() + "-" + this.getNumber();
        }
    }
}
