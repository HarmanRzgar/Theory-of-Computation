import java.util.Scanner;

public class DFA5 {

    // DFA that only accepts strings that contain the string 'aabb'

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
        if (s.charAt(i) == 'a')
            q1(s, i + 1);
        else if (s.charAt(i) == 'b')
            q0(s, i + 1);
        else
            illegal();

    }

    static void q1(String s, int i) {
        if (i == s.length()) {
            System.out.println("Rejected");
            return;
        }
        if (s.charAt(i) == 'a')
            q2(s, i + 1);
        else if (s.charAt(i) == 'b')
            q0(s, i + 1);
        else
            illegal();
    }

    static void q2(String s, int i) {
        if (i == s.length()) {
            System.out.println("Rejected");
            return;
        }
        if (s.charAt(i) == 'b')
            q3(s, i + 1);
        else if (s.charAt(i) == 'a')
            q2(s, i + 1);
        else
            illegal();

    }

    static void q3(String s, int i) {
        if (i == s.length()) {
            System.out.println("Accepted");
            return;
        }
        q3(s, i + 1);
        if (s.charAt(i) == 'b')
            q4(s, i + 1);
        else if (s.charAt(i) == 'a')
            q1(s, i + 1);
        else
            illegal();

    }

    static void q4(String s, int i) {
        if (i == s.length()) {
            System.out.println("Accepted");
            return;
        }
        if (s.charAt(i) == 'b')
            q4(s, i + 1);
        else if (s.charAt(i) == 'b')
            q4(s, i + 1);
        else
            illegal();

    }

    public static void illegal() {
        System.out.println("The string contains illegal characters!");
        return;
    }
}
