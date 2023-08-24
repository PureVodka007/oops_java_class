public class voting
{
    static String Vote(int age)
    {
        return (age >= 18)?"eligible to vote":"Not eligble to vote";
    }
     public static void main(String[] args) 
    {
        int age = Integer.parseInt(args[0]);
        
       

        System.out.println(Vote(age));
        
    }
}