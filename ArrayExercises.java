/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author salne
 */
public class ArrayExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        do {
            int choice = PrintMenu(input1);

            if (choice == 1) {
                BelowAboveAvg(input1);
            } else if (choice == 2) {
                CountEvenOdd(input1);
            } else if (choice == 3) {
                SwapLargestSmallest(input1);
            } else if (choice == 4) {
                SumRowsColumns(input1);
            } else if (choice == 5) {
                LargestSumRow(input1);
            } else if (choice == 6) {
                RepeatedElementsRow(input1);
            } else if (choice == 7) {
                print(60);
            }
        } while (true);
    }
    
     public static void print (int n ){
        if(n>0){
            print (n-20);
            System.out.println(n+" ");
        }
    }

    public static int PrintMenu(Scanner input1) {
        System.out.print("********************************************************************\n"
                + "************************* Array Exercises **************************\n"
                + "********************************************************************\n"
                + "1. Find how many elements are below and above the average          |\n"
                + "2. Find how many elements are even and how many are odd            |\n"
                + "3. Swap largest and smallest elements in the array                 |\n"
                + "4. Summing elements in each row and each column of 2-D array       |\n"
                + "5. Find row of 2-D array which has the largest sum                 |\n"
                + "6. Display row(s) of 2-D array containing repeated elements        |\n"
                + "7. Quit                                                            |\n"
                + "-------------------------------------------------------------------\n\n"
                + ">Enter your selection:");
        int choice = input1.nextInt();
        return choice;
    }

    public static void BelowAboveAvg(Scanner input1) {
        System.out.println("How many elements of the array?");
        int user = input1.nextInt();
        int arr[] = new int[user];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Elements of the array are as follows:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        int sum = 0;
        double ave;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        ave = sum / user;
        System.out.println("The average of all elements of the array is");
        System.out.println(ave);
        int above = 0;
        int below = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ave) {
                above++;
            } else if (arr[i] < ave) {
                below++;
            }
        }
        System.out.println("The number of elements above average is: ");
        System.out.println(above);
        System.out.println("The elements above average is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ave) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("The number of elements below average is: ");
        System.out.println(below);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ave) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();
    }

    public static void CountEvenOdd(Scanner input1) {
        System.out.println("How many elements of the array?");
        int user = input1.nextInt();
        int arr[] = new int[user];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Elements of the array are as follows:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("The number of elements even number is: ");
        System.out.println(even);
        System.out.println("The number of elements odd number is: ");
        System.out.println(odd);
        System.out.println("The elements even number is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("The elements odd number is: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();

    }

    public static void SwapLargestSmallest(Scanner input1) {
        System.out.println("How many elements of the array?");
        int user = input1.nextInt();
        int arr[] = new int[user];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Elements of the array are as follows:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        int max = 0;
        int min = 0;
        int maximum = arr[0];
        int manimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
                max = i;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < manimum) {
                manimum = arr[i];
                min = i;
            }
        }
        System.out.print("largest number is ");
        System.out.println(maximum);
        System.out.print("smalest number is ");
        System.out.println(manimum);

        int change = arr[max];
        arr[max] = arr[min];
        arr[min] = change;

        System.out.println("after swapping");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void SumRowsColumns(Scanner input1) {
        System.out.println("enter row");
        int r = input1.nextInt();
        System.out.println("enter colum");
        int c = input1.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
            System.out.println();
        }
        int totalr;
        int totalc;
        for (int i = 0; i < r; i++) {
            totalr = 0;
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + ",");
                totalr += arr[i][j];
            }
            System.out.println("sum of row");
            System.out.println(totalr);
            System.out.println();
        }
        for (int i = 0; i < c; i++) {
            totalc = 0;
            for (int j = 0; j < r; j++) {
                System.out.print(arr[i][j] + ",");
                totalc += arr[i][j];
            }
            System.out.println("sum of colum");
            System.out.println(totalc);
        }
        System.out.println();

    }

    public static void LargestSumRow(Scanner input1) {
        System.out.println("enter row");
        int r = input1.nextInt();
        System.out.println("enter colum");
        int c = input1.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
            System.out.println();
        }
        int totalr;
        int max = 0;
        int mindex = 0;
        for (int i = 0; i < r; i++) {
            totalr = 0;
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + ",");
                totalr += arr[i][j];
            }
            if (max < totalr) {
                max = totalr;
                mindex = i;
            }
            System.out.println();
        }
        System.out.println("maximum row" + mindex + "maximum sum" + max);
        System.out.println("element for maximum row");
        for (int i = 0; i < c; i++) {
            System.out.print(arr[mindex][i] + ",");
        }
        System.out.println();
    }

    public static void RepeatedElementsRow(Scanner input1) {
        System.out.println("enter row");
        int r = input1.nextInt();
        System.out.println("enter colum");
        int c = input1.nextInt();
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + ",");

            }
            System.out.println();

        }
        boolean check = false;
        String s = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = j + 1; k < c; k++) {
                    if (arr[i][j] == arr[i][k]) {
                        check = true;
                        s += Arrays.toString(arr[i])+"\n";
                    }
                }

            }
        }
        if (check == false) {
            System.out.println("No Repeated Value");
        } else if (check == true) {
            System.out.println("Repeated Value \n" + s);
        }
    }
}
