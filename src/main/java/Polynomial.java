import java.util.*;

public class Polynomial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> polynomial = new ArrayList<>();
        System.out.println("Polynomial");
        System.out.println("a_n * x^n - a_n1 * x^n-1 - … a_1 * x^1 + a * x^0");
        System.out.println("Going from right site enter value to polynomial");
        System.out.println("to exit type : x");

        do {
            System.out.print("... - a_n * x^n - ....  for n = " + polynomial.size() + "  enter a :");
            String number = sc.next();
            try {
                polynomial.add(Integer.valueOf(number));
            } catch (NumberFormatException e) {
                if (number.equals("x")) {
                    break;
                }
                System.out.println(" only numbers ");
            }
        } while (polynomial.size() < 20);

        Collections.reverse(polynomial);
        System.out.print("f(x) = ");

        for (int i = 0; i < polynomial.size(); i++) {
            System.out.print(polynomial.get(i) + "x^" + (polynomial.size() - 1 - i));
            if (i < (polynomial.size() - 1)) {
                System.out.print(" + ");
            }
        }
    }
}
