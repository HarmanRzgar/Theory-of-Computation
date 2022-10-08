import java.util.Scanner;

public class DFA {

    // First Practical Lecture

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        q0(str, 0);
        sc.close();

    }

    static void q0(String s, int i) {
        if (i == s.length()) {
            System.out.println("Not Accepted");
        }
        if (s.charAt(i) == '0')
            q1(s, i + 1);
        else
            q2(s, i + 1);
    }

    static void q1(String s, int i) {
        if (i == s.length()) {
            System.out.println("Accepted");
            return;
        }
        q1(s, i + 1);

    }

    static void q2(String s, int i) {
        if (i == s.length()) {
            System.out.println("Rejected");
            return;
        }
        q2(s, i + 1);

    }
}
