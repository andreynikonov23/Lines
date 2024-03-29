package nick.pack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Введите строку");
    int decimal = scanner.nextInt();
    System.out.println(toBinary(decimal));
    }

    public static String toBinary(int decimal){
        int binary = 0;
        int two = 2;

        for (int i = 2; i <= decimal; i *=2) {
            two = i;
        }
        int count = 0;
        int tempDec = decimal;
        for (int i = two; i > 0; i /=2) {
            if (i <= tempDec){
                tempDec = tempDec - i;
                count++;
            } else
                count++;
        }
        int[] array = new int[count];
        System.out.println(array.length);
        for (int i = two,j = 0; i > 0; i /=2, j++) {
            if (i <= decimal){
                decimal = decimal - i;
                array[j] = 1;
            } else
                array[j] = 0;
        }
        String temp = String.valueOf(array[0]);
        StringBuilder builder = new StringBuilder(temp);
        for (int i = 1; i < array.length; i++) {
            builder = builder.append(array[i]);
        }
        temp = String.valueOf(builder);
        return temp;
    }
}
