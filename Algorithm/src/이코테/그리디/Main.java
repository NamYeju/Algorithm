package Algorithm.src.이코테.그리디;


public class Main {
    static int cnt = 0;
    static int[] coin = new int[]{500, 100, 50, 10};

    public Main() {
    }

    public static void main(String[] args) {
        int n = 1260;

        for(int i = 0; i < 4; ++i) {
            cnt += n / coin[i];
            n %= coin[i];
        }

        System.out.println(cnt);
    }
}

