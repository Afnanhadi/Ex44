import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//1.Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2
                int[] arry1 = {50, -20, 0, 30, 40, 60, 10};
                for (int o = 0; o < arry1.length; o++) {

                    if(arry1[0] == arry1[6]) {
                        System.out.println("true");
                        break;
                    } else {
                        System.out.println("fulse");
                        break;
                    }
                }
//2.Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
                            Integer arr3[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
                            Scanner s=new Scanner(System.in);
                            int a=s.nextInt();
                            System.out.println(Arrays.toString(arr3));
                            System.out.println("  largest elements of the said array are:"+a);
                            Arrays.sort(arr3, Collections.reverseOrder());
                            for (int i = 0; i < a; i++)
                                System.out.print(arr3[i] + " ");

//3.Write a Java program to find the numbers greater than the average of the numbers of a given array.
                int[] arr = {1, 4, 17, 7, 25, 3, 100};
                int sum = 0;
                for (int u = 0; u < arr.length; u++) {
                    sum = sum + arr[u];
                }
                int avg = sum / arr.length;
                System.out.println("\nThe average of the said array is:"+avg);
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > avg) {
                        System.out.println("greater than the average are: " + arr[i]);
                    }
                }
//4.Write a Java program to get the larger value between first and last element of an array of integers
                int[] arrr = {20, 30, 40};
                int max = arrr[0];
                if (arrr[2] >= max)
                    max = arrr[2];
                System.out.println("Larger value between first and last element:" + max);

//5.Write a Java program to swap the first and last elements of an array and create a new array.
                int[] arrr_swap = {20, 30, 40};
                int swap = arrr_swap[0];
                arrr_swap[0] = arrr_swap[arrr_swap.length - 1];
                arrr_swap[arrr_swap.length - 1] = swap;
                System.out.println(Arrays.toString(arrr_swap));
//6.Write a Java program to find all of the longest word in a given dictionary
    //اسفه اني ماحليته عشاني  مافهمته

//7.Write a menu driven Java program with following option:
        System.out.println("enter size arry : ");
        int af =s.nextInt();
        int[] w=new int[af];
        for (int ii=0; ii<w.length; ii++) {
            System.out.println("enter list:  ");
           w[ii]=s.nextInt();
        }System.out.println(Arrays.toString(w));

        Arrays.sort(w);
        System.out.println(Arrays.toString(w));
 //8. Write a program thats displays the number of occurrences of an element in the array.

              int count=0;
              int [] arra8={1,1,1,3,3,5};
              int e=s.nextInt();
              for (int i=0;i<arra8.length; i++) {
                  if (e == arra8[i]) {
                      count = count + 1;

                  }
              }

                     System.out.println(count);

 //9. Write a program that places the odd elements of an array before the even elements
               int[] y = {2, 3, 40, 1, 5, 9, 4, 10, 7};
               int u=0;
               System.out.println(Arrays.toString(y));
                for (int i = 0; i<y.length ; i++){
                    if  (y[i]%2==0)
                    for (int p1=i+1;p1<y.length ; p1++)
                        if(y[p1]%2==1)
                    {
                        u=y[i];
                        y[i]=y[p1];
                        y[p1]=u;



            }
        }System.out.println(Arrays.toString(y));
//10. Write a program that test the equality of two arrays.
                      int [] numbrs1={2,3,6,6,4};
                      int [] numbrs2={2,3,6,6,4};
                      boolean bb=Arrays.equals(numbrs2,numbrs1);
                          System.out.println(bb);



                      }


                    }











