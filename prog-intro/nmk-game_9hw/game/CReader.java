package game;

import java.util.Scanner;

public class CReader extends Main {
    public Scanner sc = new Scanner(System.in);

    private String check;

    int readInt(String check) {
        this.check = check;
        String s = sc.next();
        while (!isNum(s)) {
            System.out.println("Your input is incorrect, please try again");
            s = sc.next();
        }
        return Integer.parseInt(s);
    }

    String readPlayer() {
        String s = sc.next();
        while (!s.equals("Human") && !s.equals("Sequential") && !s.equals("Random")) {
            System.out.println("Player type is incorrect, please tyr again");
            s = sc.next();
        }
        return s;
    }

    private boolean isNum(String s) {
        int x;
        try {
            x = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        if (check.equals("K")) {
            return (x <= n && x <= m) && x > 0;
        }
        if (check.equals("move")) {
            return (x <= n && x <= m) && (x >= 0);
        }
        return (x > 0);
    }
}
