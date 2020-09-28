import java.text.BreakIterator;

public class if_statement {
    public static void main(String[] args) {
        String color = "";
        switch (color){
            case "red":
             System.out.println("A red car");
             break;
            case "green":
                System.out.println("a green car");
            break;
            default:
                System.out.println("the car has no colour");



        }
        String x = "pink";

        if (x == "red") System.out.println("Bilen er rød");
        else if (x == "pink")
        System.out.println("The car is pink");
        else System.out.println("The car has no colour");



    }

}
