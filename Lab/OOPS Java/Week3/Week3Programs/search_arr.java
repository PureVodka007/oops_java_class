package Week3Programs;

import java.util.Scanner;

public class search_arr
{
    static Scanner sc = new Scanner(System.in);
    public static int[] mFill(int n)
    {
    
        int[] a = new int[n];

        System.out.println("Elements in matrix: ");

        for(int i = 0; i<n;i++)
        {
            System.out.print("["+i+"]: ");
            a[i] = sc.nextInt();
        }
        return a;
    }
   static int find(int e, int[] a)
   {
        for(int i : a)
        {
            if(e == i)
            {
                return i;
            }
        }
        return -1;
   }
   
    public static void main(String[] args)
    {
    int n; int pos;
    
    System.out.print("No of elements: ");
    n = sc.nextInt();
    
    int[] a = mFill(n);

    System.out.print("Enter element to search: ");
    n = sc.nextInt();
    pos = find(n, a);
    if(pos == -1)
    {
        System.out.println("Not Found!");
    }
    else
    {
        System.out.println("Found!: "+pos);
    }

   }

}