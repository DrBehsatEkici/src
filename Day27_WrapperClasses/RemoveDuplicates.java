package Day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    //
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



        public static void main(String[] args) {
            int[] arr = new int[]{1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4};
            arr = removeDuplicates(arr);
            System.out.println(Arrays.toString(arr));
            System.out.println("-------------------------------");
            String[] words = new String[]{"Java", "Java", "Python", "C#", "Java", "Java"};
            words = removeDuplicates(words);
            System.out.println(Arrays.toString(words));
        }

        public static int[] removeDuplicates(int[] array) {
            int[] result = new int[0];
            int[] var2 = array;
            int var3 = array.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                int each = var2[var4];
                if (!ArraysUtility.contains(result, each)) {
                    result = ArraysUtility.addElement(result, each);
                }
            }

            return result;
        }

        public static double[] removeDuplicates(double[] array) {
            double[] result = new double[0];
            double[] var2 = array;
            int var3 = array.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                double each = var2[var4];
                if (!ArraysUtility.contains(result, each)) {
                    result = ArraysUtility.addElement(result, each);
                }
            }

            return result;
        }

        public static char[] removeDuplicates(char[] array) {
            char[] result = new char[0];
            char[] var2 = array;
            int var3 = array.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                char each = var2[var4];
                if (!ArraysUtility.contains(result, each)) {
                    result = ArraysUtility.addElement(result, each);
                }
            }

            return result;
        }

        public static String[] removeDuplicates(String[] array) {
            String[] result = new String[0];
            String[] var2 = array;
            int var3 = array.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String each = var2[var4];
                if (!ArraysUtility.contains(result, each)) {
                    result = ArraysUtility.addElement(result, each);
                }
            }

            return result;
        }
    }


