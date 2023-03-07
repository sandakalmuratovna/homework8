import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");

        // first condition
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        // second condition
        double[] results = {1.57, 7.654, 9.986};

        // third condition
        char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g','h','i','j'};

        System.out.println("Task2");
        for(int i=0;i<weight.length-1;i++){
            System.out.print(weight[i]+",");
        }
        System.out.println(weight[weight.length-1]);

        for(int i=0;i<results.length-1;i++){
            System.out.print(results[i]+",");
        }
        System.out.println(results[results.length-1]);

        for(int i=0;i<letters.length-1;i++){
            System.out.print(letters[i]+",");
        }
        System.out.println(letters[letters.length-1]);

        System.out.println("Task3");

        // print first array backward
        for(int i=weight.length-1;i>0;i--){
            System.out.print(weight[i]+",");
        }
        System.out.println(weight[0]);

        // print second array backward
        for(int i=results.length-1;i>0;i--){
            System.out.print(results[i]+",");
        }
        System.out.println(results[0]);

        //print third array backward
        for(int i=letters.length-1;i>0;i--){
            System.out.print(letters[i]+",");
        }
        System.out.println(letters[0]);

        System.out.println("Task 4");
        evenNumber(weight);
        System.out.println(Arrays.toString(weight));
    }

    public static void evenNumber(int[] numbers){
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]%2!=0){
                numbers[i] = numbers[i] + 1;
            }
        }
    }



}