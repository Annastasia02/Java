package ТретийУрок;

public class Kit {
    public static void main(String[] args) {
        doOne();
        doTwo();
        doFree();
        doFor();
        doSix();
    }
    public static void doOne() {
        int[] kit = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int kiti = kit.length;
        for (int i = 0; i < kiti; i++) {
            System.out.print("[" + i + "]=" + kit[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < kiti; i++)
            if (kit[i] == 1) {
                kit[i] = 0;
            } else kit[i] = 1;
        for (int i = 0; i < kiti; i++) {
            System.out.print("[" + i + "]=" + kit[i] + " ");
        }
    }
    public static void doTwo() {
        int[] kit = new int[101];
        kit[0] = 0;
        for (int i = 0; i < kit.length; i++) {
            System.out.println("[" + i + "]=" + kit[0]++);
        }
    }
    public static void doFree() {
        {
            int[] kit = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int kiti = kit.length;
            for (int i = 0; i < kiti; i++) {
                if (kit[i] < 6) kit[i] = kit[i] * 2;
            }
            for (int i = 0; i < kiti; i++) {
                System.out.print("[" + i + "]=" + kit[i] + " ");
            }
        }
    }
    public static void doFor() {
        int[][] kit = new int[3][3];
        for (int i = 0; i < kit.length; i++) {
            for (int j = 0, x = kit[i].length; j < kit[i].length; j++, x--) {
                if (i == j || i == x - 1) kit[i][j] = 1;
                System.out.print(kit[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void doSix() {
        int[] kit = {10, 6, -7, 0, 30, 45, 47, 1};
        int maxi = 0;
        int mini = 0;
        for (int j : kit) {
            if (j > maxi) {
                maxi = j;
            } else if (j < mini) {
                mini = j;
            }
        }
        System.out.println("Минимальный элемент: " + mini + ". " + "Максимальный элемент: " + maxi);
    }
}

