public class Main {
    public static void main(String[] args) {
        //Задачи 1, 2
        int[] weight = {1, 2, 3};
        double[] number = {1.57, 7.654, 9.986};
        int[] apples = {5, 7, 56, 64, 23, 77};
        for (int i = 0; i < weight.length; i = i + 1) {
            if (i == 2) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int i = 0; i < number.length; i = i + 1) {
            if (i == 2) {
                System.out.println(number[i]);
                break;
            }
            System.out.print(number[i] + ", ");
        }
        for (int i = 0; i < apples.length; i = i + 1) {
            if (i == 5) {
                System.out.println(apples[i]);
                break;
            }
            System.out.print(apples[i] + ", ");
        }


//Задача 3
        int[] weight2 = {3, 2, 1};
        double[] number2 = {9.986, 7.654, 1.57};
        for (int i = 0; i < weight.length; i = i + 1) {
            if (i == 2) {
                System.out.println(weight2[i]);
                break;
            }
            System.out.print(weight2[i] + ", ");
        }
        for (int i = 0; i < number.length; i = i + 1) {
            if (i == 2) {
                System.out.println(number2[i]);
                break;
            }
            System.out.print(number2[i] + ", ");
        }


//Задача 4
        int[] a = {1, 2, 3};
        for (int b = 0; b < a.length; b = b + 1) {
            if (a[b] % 2 != 0) {
                a[b] = a[b] + 1;
            }
            if (b == 2) {
                System.out.println(a[b]);
                break;
            }
            if (b != 0) {
                System.out.print(a[b]);
                System.out.print(", ");
            }


        }
    }
}