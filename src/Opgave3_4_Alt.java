public class Opgave3_4_Alt {
    public static void main(String[] args) {

        // define the range
        int max = 12;
        int min = 1;
        int range = max - min + 1;

        // To print multiple months in a loop
        int samples = 10;
        //  Wrap this loop around bottom code
        for (int i = 0; i < samples ; i++) {
            int number = (int)(Math.random() * range) + min;
            System.out.println(Month.values()[number-1]);
        }
    }
}