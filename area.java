public class area
{
    
    public static void main(String[] args)
    {
       CalculateArea ob = new CalculateArea();
	   ob.area(1);
	   ob.area(1,2);
	   ob.area(3.4);
    }
}
class CalculateArea
{
    void area(float x)
    {
        System.out.println("The area of the square is: "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("The area of the rectangle is: "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is: "+z+" sq units");
    }
}



