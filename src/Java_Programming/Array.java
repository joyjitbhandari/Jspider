package Java_Programming;
public class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arr0(array);
        System.out.println();
        arr1(array);
        System.out.println();
        arr2(array);
        System.out.println();
        arr3(array);
        System.out.println();
        arr4(array);
        System.out.println();
        arr5(array);
        System.out.println();
        arr6(array);
        System.out.println();
        arr7(array);
        System.out.println();
        arr8(array);
        System.out.println();
        arr9(array);
        System.out.println();
        arr10(array);
        System.out.println();
        arr11(array);
        System.out.println();
        arr12(array);
        System.out.println();
        arr13(array);
        System.out.println();
        arr14(array);
        System.out.println();
        arr15(array);
        System.out.println();
        arr16(array);
        System.out.println();
        arr17(array);
        System.out.println();
        arr18(array);
        System.out.println();
        arr19(array);
        System.out.println();
        arr20(array);
        System.out.println();

    }

    // array Methods  ********************************************************************************

    //Array items with index
    static void arr0(int[] arr) {
        System.out.println("0. Array items are");
        System.out.println(" Index Items");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t" + i + "\t" + arr[i]);
        }
    }

    // array items
    static void arr1(int[] arr) {
        System.out.println("1. The array items are :- " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t"+arr[i]);
        }
    }
    // Odd items in array
    static void arr2(int[] arr) {
        System.out.println("2. In array odd items are :- ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println("\t"+arr[i]);
            }
        }
    }

    //Square of given array
    static void arr3(int[] arr) {
        System.out.println("3. Square of array items are :- " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t"+(arr[i] * arr[i]));
        }
    }
    //Square of even num in given array
    static void arr4(int[] arr) {
        System.out.println("4. Square of even numbers array items are :- " );
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("\t"+(arr[i] * arr[i]));
            }
        }
    }
    //Square of odd num in given array
    static void arr5(int[] arr) {
        System.out.println("5. Square of odd numbers array items are :- ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println("\t"+(arr[i] * arr[i]));
            }
        }
    }

    //Square of sum of given array
    static void arr6(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (arr[i] * arr[i]);
        }
        System.out.println("6. Square of sum of array is:- " + sum);
    }
    //Square of sum of even number in array
    static void arr7(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + (arr[i] * arr[i]);
            }
        }
        System.out.println("7. Square of sum of Even Numbers is:- " + sum);
    }
    //Square of sum of odd number in array
    static void arr8(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sum = sum + (arr[i] * arr[i]);
            }
        }
        System.out.println("8. Square of sum of Odd Numbers is:- " + sum);
    }

    //Square of multiplication of given array
    static void arr9(int[] arr) {
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul = mul * (arr[i] * arr[i]);
        }
        System.out.println("9. Square of multiplication of given array is:- " + mul);
    }
    //Square of multiplication of Even Number
    static void arr10(int[] arr) {
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                mul = mul * (arr[i] * arr[i]);
            }
        }
        System.out.println("10. Square of multiplication of Even Numbers is:- " + mul);
    }
    //Square of multiplication of Odd Number
    static void arr11(int[] arr) {
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                mul = mul * (arr[i] * arr[i]);
            }
        }
        System.out.println("11. Square of multiplication of Odd Numbers is:- " + mul);
    }

    // Count num of integer in given array
    static void arr12(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("12. The count of array integer is :- " + count);
    }
    // Count of even number in given array
    static void arr13(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("13. The count of Even number in array is :- " + count);
    }
    // Count of Odd number in given array
    static void arr14(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("14. The count of Odd number in array is :- " + count);
    }

    //Cubes of given array
    static void arr15(int[] arr) {
        System.out.println("15. cubes of array :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t"+(arr[i] * arr[i] * arr[i]));
        }
    }
    //Cubes of even number in given array
    static void arr16(int[] arr) {
        System.out.println("16. cubes of even number in array :- ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("\t"+(arr[i] * arr[i] * arr[i]));
            }
        }
    }
    //Cubes of odd number in given array
    static void arr17(int[] arr) {
        System.out.println("17. cubes of odd number in array :- ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println("\t"+(arr[i] * arr[i] * arr[i]));
            }
        }
    }

    // Cubes of sum of given array
    static void arr18(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
           int cube= (arr[i] * arr[i] * arr[i]);
           sum = sum+cube;
        }
        System.out.println("18. The cube of sum :- "+sum);
    }
    // Cubes of sum of even number in given array
    static void arr19(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int cube = (arr[i] * arr[i] * arr[i]);
                sum = sum + cube;
            }
        }
        System.out.println("19. The cube of sum of even number is :- " + sum);
    }
    // Cubes of sum of odd number in given array
    static void arr20(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                int cube = (arr[i] * arr[i] * arr[i]);
                sum = sum + cube;
            }
        }
        System.out.println("20. The cube of sum of odd number is :-  " + sum);
    }
}