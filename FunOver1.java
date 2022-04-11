// Create a class named 'PrintNumber' to print various numbers of different datatypes
// by creating different methods with the same name 'printn' having a parameter for each datatype.
class PrintNumber
{
    public void printnum(int n)
    {
        System.out.println("Integer " + n );
    }

    public void printnum(float n)
    {
        System.out.println("Float number is" + n);
    }

    public void printnum(String n)
    {
        System.out.println("String value is" + n);
    }
}

public class FunOver1
{
    public static void main()
    {
        PrintNumber p1 = new PrintNumber();
        p1.n=10;
        p1.printn();
    }
}