import java.util.Scanner;

public class rmDup
{
    public Scanner sc = new Scanner(System.in);

    static int isdup(int[] a, int n)
    {
        int[] dup = new int[n]; // creating a duplicate array

        for( int i:a)
        {
            int issame = 0;
            
            for (int j:a)
            {
                if(i == j)
                {
                    issame++;
                }
            }

            if(issame >1)
            {

            }
        }

        return ;
    }

     public static void main(String[] args) 
    {
        
    
    }
}