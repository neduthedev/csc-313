public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println("*".repeat(3) + "=".repeat(3) + "*".repeat(3));
        }
    }
}


public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print((j < 3 || j > 5) ? "*" : "=");
            }
            System.out.println();
        }
    }
}


public class CustomNigerianFlagSingleLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i < 3 ? "***=======" : "==========");
        }
    }
}


public class CustomNigerianFlagNestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (i < 3 ? 10 : 10); j++) {
                System.out.print(j < 3 && i < 3 ? "*" : "=");
            }
            System.out.println();
        }
    }
}


import java.util.Arrays;

public class StatisticsCalculator {
    public static void main(String[] args) {
        int[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        Arrays.sort(data);

        double mean = Arrays.stream(data).average().orElse(0.0);
        double median = (data.length % 2 == 0) ? (data[data.length / 2 - 1] + data[data.length / 2]) / 2.0 : data[data.length / 2];
        double stdDev = Math.sqrt(Arrays.stream(data).mapToDouble(i -> Math.pow(i - mean, 2)).average().orElse(0.0));

        System.out.println("Mean: " + mean + "\nMedian: " + median + "\nStandard Deviation: " + stdDev);
    }
}


import java.util.Scanner;

public class OneDArrayInput {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int value : array) {
            System.out.println(value);
        }

        scanner.close();
    }
}


import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("You entered:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
