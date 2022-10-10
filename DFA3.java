import java.util.Scanner;

public class DFA3 {

    // Second Practical Lecture
    // DFA that only accepts strings that end with 00 or 11

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
            System.out.println("Rejected");
            return;
        }
        if (s.charAt(i) == '0')
            q3(s, i + 1);
        else
            q2(s, i + 1);
    }

    static void q2(String s, int i) {
        if (i == s.length()) {
            System.out.println("Rejected");
            return;
        }
        if (s.charAt(i) == '0')
            q1(s, i + 1);
        else
            q4(s, i + 1);

    }

    static void q3(String s, int i) {
        if (i == s.length()) {
            System.out.println("Accepted");
            return;
        }
        if (s.charAt(i) == '0')
            q3(s, i + 1);
        else
            q2(s, i + 1);

    }

    static void q4(String s, int i) {
        if (i == s.length()) {
            System.out.println("Accepted");
            return;
        }
        if (s.charAt(i) == '0')
            q1(s, i + 1);
        else
            q4(s, i + 1);

    }
}
