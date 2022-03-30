package Algorithm.src.이코테.다이나믹프로그래밍;

public class Main {
    static int[] cache = new int[50];

    public Main() {
    }

    static int dp(int x) {
        if (x != 1 && x != 2) {
            return cache[x] != 0 ? cache[x] : (cache[x] = dp(x - 1) + dp(x - 2));
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(dp(30));
    }
}
