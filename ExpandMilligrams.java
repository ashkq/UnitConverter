import java.util.Scanner;
public class ExpandMilligrams {
    public static void main(String[] args) {
        long milligrams;
        long kilograms;
        long grams;
        System.out.println("Please enter milligrams to be converted into kilograms, grams and milligrams:");
        Scanner scan = new Scanner(System.in);
        milligrams = scan.nextLong();
        kilograms = milligrams / 1000000;
        milligrams = milligrams - (kilograms * 1000000);
        grams = milligrams / 1000;
        milligrams = milligrams - (grams * 1000);
        System.out.println(kilograms + " kilograms, " + grams + " grams, " + milligrams + " milligrams");
    }
}