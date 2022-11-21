import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        long sum = 0; //Balance
        long repl = 2200; //replenishment

        if (repl >= 1000) {
            long bonus = repl / 100;
            sum += bonus;
            System.out.println(bonus + " Бонус");
        }
        System.out.println(sum + repl + " Общая сумма");
    }
}