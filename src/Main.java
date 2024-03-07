import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] level = new int[]{1, 2, 3};
        double[] share = {1.57, 7.654, 9.986};
        int[] mass = new int[4];
        mass[0] = 10;
        mass[1] = 20;
        mass[2] = 30;
        mass[3] = 40;
        System.out.println();

        System.out.println("Задача №2");
        System.out.print(level[0] + ", " + level[1] + ", " + level[2]);
        System.out.println();
        System.out.print(share[0] + ", " + share[1] + ", " + share[2]);
        System.out.println();
        System.out.print(mass[0] + ", " + mass[1] + ", " + mass[2] + ", " + mass[3]);
        System.out.println();

        System.out.println("Задача №3");
        for (int i = 2; i >= 0; i--) {
            System.out.print(level[i] + ", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(share[i] + ", ");
        }
        System.out.println();
        for (int i = 3; i >= 0; i--) {
            System.out.print(mass[i] + ", ");
        }
        System.out.println();

        System.out.println("Задача №4");
        for (int i = 0; i < level.length; i++) {
            level[i]++;
            if (level[i] % 2 == 0) {
                System.out.print(level[i] + ", ");
            }
        }
    }
}