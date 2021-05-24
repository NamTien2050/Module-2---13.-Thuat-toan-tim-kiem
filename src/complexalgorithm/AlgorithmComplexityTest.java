package complexalgorithm;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        String charater;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao:");
        charater = scanner.nextLine();
        int[] most = new int[255];
        for (int i = 0; i < charater.length(); i++) {
            int ascii = (int) charater.charAt(i);
            most[ascii] += 1;
        }
        int max = 0;
        char charaterrr = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (most[j] > max) {
                max = most[j];
                charaterrr = (char) j;
            }
        }
        System.out.println("a "+charaterrr+" b "+max);
    }
}
