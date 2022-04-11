class Shape
{
    String color;
    void dis()
    {
        System.out.println(this.color);
    }

    
}

class Triangle extends Shape
{
   
    
}

public class Inheri1
{
    public static void main(String args[])
    {
        Triangle t1 = new Triangle();
        t1.color = "Green";
        t1.dis();
    }
}