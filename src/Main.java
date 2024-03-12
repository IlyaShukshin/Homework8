import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] level = new int[3];
        level[0] = 1;
        level[1] = 2;
        level[2] = 3;
        double[] share = {1.57, 7.654, 9.986};
        int[] mass = new int[4];
        mass[0] = 10;
        mass[1] = 20;
        mass[2] = 30;
        mass[3] = 40;
        System.out.println();
        System.out.println("Задача №2");
        for (int i = 0; i < level.length; i++) {
            if (i != level.length - 1)
                System.out.print(level[i] + ", ");
            else {
                System.out.print(level[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < share.length; i++) {
            if (i != share.length - 1)
                System.out.print(share[i] + ", ");
            else {
                System.out.print(share[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if (i != mass.length - 1)
                System.out.print(mass[i] + ", ");
            else {
                System.out.print(mass[i]);
            }
        }
        System.out.println();
        System.out.println("Задача №3");
        for (int i = level.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(level[i] + ", ");
            else {
                System.out.print(level[i]);
            }
        }
        System.out.println();
        for (int i = share.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(share[i] + ", ");
            else {
                System.out.print(share[i]);
            }
        }
        System.out.println();
        for (int i = mass.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(mass[i] + ", ");
            else {
                System.out.println(mass[i]);
            }
        }
        System.out.println();
        System.out.println("Задача №4");
        for (int i = 0; i < level.length; i++) {
            if (level[i] % 2 == 0) {
                System.out.print(level[i] + " ");
            } else {
                level[i]++;
                System.out.print(level[i] + " ");
            }
        }
    }
}