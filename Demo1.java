
class Pen{
    String color;
    String type;
    int price;

    public void write()
    {
      System.out.println("Writing something");
    }


    public void Details()
    {
        System.out.println("Details of my Pen is" +" " + color + " " + type + " " + price );
    }

    public void printColor()
    {
      System.out.println(this.color);
      System.out.println(this.type);
      System.out.println(price);
      

    }
}
   

 class Demo1
{
    public static void main(String[] args)
  {
    Pen p1 = new Pen();
    p1.color="Blue";
    p1.type="Gel";
    p1.price=5;
    p1.write();
    p1.printColor();

    Pen p2 = new Pen();
    p2.color="Black";
    p2.type="Ballpoint";
    p2.price=10;
    p2.write();
    p2.printColor();
    
  }
}