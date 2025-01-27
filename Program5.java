
import java.util.*;

public class Program5 {
    public static void main(String[] args) {
        int Penn = 14;
        int Studdents = 3;
        int total = Penn / Studdents;
        int remainingPenn = Penn % Studdents;

        System.out.println("The Pen Per Student is " + total + " and the remaining pen not distributed is " + remainingPenn);
    }
}
