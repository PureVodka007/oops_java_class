package Week3Programs;
import java.util.Scanner;
public class rmDup
{
    static Scanner sc = new Scanner(System.in);
    static int n;

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

    public static int[] DupR(int[] a, int n)
    {
        int[] dup = new int[n]; // creating a duplicate array
        int index = 0;
        for( int i= 0;i<n;i++)
        {  
            if( (isdup(a[i],dup,n)) < 1)
            {
                dup[index] = a[i];
                index++;
            }
        }
        
        int[] r = new int[index];
        for (int k = 0; k<index;k++)
        {
            r[k] = dup[k];
        }

        return r;
    }

    public static int isdup(int e,int[] a,int n)
    {   
        int r =0;
        for(int i = 0; i<n;i++)
        {
            if( e == a[i])
            {
                r++;
            }
        }

        return r;
    }
        public static void mDis(int[] a)
        {   
            System.out.println("Unique elements: ");

                for(int i : a)
                {
                    System.out.print(i+" ");
                }
            System.out.println("");
        }


     public static void main(String[] args) 
    {   
        

         System.out.print("Enter the no of elements: ");   
        n = sc.nextInt();
        
        mDis(DupR(mFill(n),n)); // filling the matrix and removing duplicates
         // Display the matrix
    }
}