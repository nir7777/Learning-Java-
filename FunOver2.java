// Create a class to print the area of a square and a rectangle. The class has two methods 
// with the same name but different number of parameters. The method for printing area of 
// rectangle has two parameters which are length and breadth respetively while the other 
// method for printing area of square has one parameter which is side of square.


class Angle
{
    public void  area(int a)
    {
       int x=a*a;
       System.out.println("Area of Square is "+ " "+ x);

    }

    public void  area(int l, int b)
    {
       int x=l*b;
       System.out.println("Area of Rectangle is "+ " "+ x);

    }
}



public class FunOver2
{
    public static void main(String args[])
    {
        Angle a1 = new Angle();
        a1.area(4,2);
        a1.area(4);
    }
}