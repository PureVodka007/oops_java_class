import java.util.Scanner;
/*
 * Java 2 matrix adder
 * 
 * TODO(In future):
 * 
 *  2 . ability to sub , multiply,div the matrices (thats gonna take a long amt time lol)
 * 
 * PS: 1.maybe i had too many methods?
 *     2.Didn't use for each loop
 *  pff... who cares 
 */
public class mAdd
{
    static Scanner sc = new Scanner(System.in);
    // fills the matrix
    static int[][] mfill(int r,int c)
    {
        
        int t =0;
        int[][] m= new int [r][c];

         for(int i = 0; i< r;i++)
       {
             for(int j = 0;j<c; j++)
             {
            System.out.print("Type num " +"["+i+"]"+"["+j+"]: ");
            t = sc.nextInt();
            m[i][j] = t;
             }
       }
       
       return m;
    }

    static int[][] mprep(int r ,int c)
    {
        int[][] a = new int[r][c];
        for( int i = 0; i<r;i++)
        {
            for (int j = 0;j<c;j++)
            {
                if (i == j)
                {
                    a[i][j] = 1;
                }
            }
        }

        return a;
    }

    static int[][] Multi (int[][] m1,int[][] m2,int r,int c)
    {
        int[][] ans = new int[r][c];

        for (int i = 0;i<r;i++)
        {
            for(int j = 0; j< c;j++)
            {
                for(int k = 0; k<r;k++)
                {
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return ans;
    }
    // Adds the matrix 
    static int[][] Add( int[][] m1, int[][] m2,int r ,int c)
    {
        int [][] ans = new int[r][c];

         for(int i = 0; i< r;i++)
       {
             for(int j = 0;j<c; j++)
             {
            ans[i][j] = m1[i][j] + m2[i][j];
            
             }
       }
       return ans;
    }
    static int[][] Sub( int[][] m1, int[][] m2,int r ,int c)
    {
        int [][] ans = new int[r][c];

         for(int i = 0; i< r;i++)
       {
             for(int j = 0;j<c; j++)
             {
            ans[i][j] = m1[i][j] - m2[i][j];
            
             }
       }
       return ans;
    }
    // Display the matrix
    static void dis(int[][]m,int r,int c)
    {
        System.out.println("\nThe Ans Matrix:");
         for(int i = 0; i< r;i++)
       {
             for(int j = 0;j<c; j++)
             {
                System.out.print(m[i][j]+ " ");
          
             }
             System.out.println("");

       }
    }

    // this fn recives , adds ,display the matrix 
    static void Mat_Master(int n , int r ,int c,int m)
    {
        // A 3D Array
        int[][][] master = new int [n][r][c];

        // Ans array
        int [][] ans = new int [r][c]; // did'nt enter values turns out java assigns 0 by default :D
        ans = (m == 3 )? mprep(r, c): ans;
        for( int k = 0;k<n;k++)
        {
            // it stores the value in master in turns add to ans (WOW)
            System.out.println("Matrix "+ (k+1));
           master[k]= mfill(r, c);
           
           switch (m)
           {
            case 1 :
                ans = Add(ans,master[k], r, c);
                break;
            case 2:
                ans = Sub(ans,ans, r, c);
                break;
            case 3:
                
                ans = Multi(ans, master[k], r, c); // doesnet wrk
            }
        }

        dis(ans,r,c); // Display the answer
         

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int rows1 = 0; int col1 = 0; int n = 0; int mode = 0;

        System.out.print("No of Matrices: ");
        n = sc.nextInt();
        System.out.print("Type the no of  rows: ");
        rows1 = sc.nextInt();
        System.out.print("No of coloums: ");
        col1 = sc.nextInt();
        System.out.println("What type of operation: ");
        mode = sc.nextInt();
        
        

        Mat_Master(n, rows1, col1,mode); // the master function
        sc.close();
      
        
    }
}