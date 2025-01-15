public class MyClass {
    public static void main(String[] args) {
        long i = 10;
        try {
            while (true) {
                i++;
                if (i > 1000000) {
                    System.out.println("i is greater than 1000000");
                    throw new Exception("Throwing exception");
                }
            }
        } catch (Exception e) {
            System.out.println("Exception caught");
            System.out.println("i = " + i);
        }
    }
}