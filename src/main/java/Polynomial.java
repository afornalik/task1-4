import java.util.*;

public class Polynomial {
    public static void main(String[] args) {

        //There is only ArrayList implementation

        Scanner sc = new Scanner(System.in);
        List<Integer> polynomial = new ArrayList<>();
        Set<Poly> polynomialSet = new TreeSet<>();

        System.out.println("Polynomial");
        System.out.println("a_n * x^n - a_n1 * x^n-1 - … a_1 * x^1 + a * x^0");
        System.out.println("Going from right site enter value to polynomial");
        System.out.println("to exit type : x");

        int order = 0;
        do {
            System.out.print("... - a_n * x^n - ....  for n = " + polynomial.size() + "  enter a :");
            String number = sc.next();
            try {
                Integer parseNumber = Integer.valueOf(number);
                polynomialSet.add(new Poly(parseNumber, order));
                polynomial.add(parseNumber);
                order++;
            } catch (NumberFormatException e) {
                if (number.equals("x")) {
                    break;
                }
                System.out.println(" only numbers ");
            }
        } while (polynomial.size() < 20);

        //ArrayList implementation
        Collections.reverse(polynomial);
        System.out.println("ArrayList");
        System.out.print("f(x) = ");

        for (int i = 0; i < polynomial.size(); i++) {
            System.out.print(polynomial.get(i) + "x^" + (polynomial.size() - 1 - i));
            if (i < (polynomial.size() - 1)) {
                System.out.print(" + ");
            }
        }
        System.out.println();

        //TreeSet implementation
        System.out.println("TreeSet");
        System.out.print("f(x) = ");
        polynomialSet.forEach(x -> System.out.print(x.getN()+"x^"+x.getOrder() +" + "));
    }

    private static class Poly implements Comparable {

        private final int n;
        private final int order;

        Poly(int n, int order) {
            this.n = n;
            this.order = order;
        }

        int getN() {
            return n;
        }

        int getOrder() {
            return order;
        }

        @Override
        public int compareTo(Object o) {
            Poly other = (Poly) o;
            return Integer.compare(other.order, this.order);
        }
    }
}
