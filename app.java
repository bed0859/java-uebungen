public class App {

    // ggT mit Subtraktion
    static int ggT_Subtraktion(int A, int B) {
        while (A != B) {
            if (A > B) {
                A = A - B;
            } else {
                B = B - A;
            }
        }
        return A;
    }

    // Fakultät mit Schleife
    static long fakultaet(int n) {
        long ergebnis = 1;
        for (int i = 2; i <= n; i++) {
            ergebnis *= i;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
        int A = 25;
        int B = 15;
        int ggt = ggT_Subtraktion(A, B);
        System.out.println("ggT (mit Subtraktion) von " + A + " und " + B + " ist: " + ggt);

        int n = 5;
        long fak = fakultaet(n);
        System.out.println("Fakultät von " + n + " ist: " + fak);
    }
}
