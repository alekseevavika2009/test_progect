import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number = " + calc (i, RandomGenerator.getDefault().nextInt()));
        }
    }

    static int calc(int a, int b) {
    if (a > b) {
        return a * b;
    }
    else if (b >0) {
        return a / b;
    }
    return 0;
    }
}