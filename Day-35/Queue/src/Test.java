public class Test
{
   /* public  int aMethod()
    {
        static int i = 0;
        i++;
        return i;
    }*/
   static boolean foo(char c)
   {
       System.out.print(c);
       return true;
   }
    public static void main(String args[])
    {
        int x = 0;
        assert (x > 0) : "assertion failed"; /* Line 6 */
        System.out.println("finished");
    }
}