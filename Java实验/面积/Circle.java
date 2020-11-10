public class Circle
{
    int radius;

    Circle(int r){ radius=r; }

    double doArea()
    {
        double area;
        area = 3.14 * radius * radius;
        return area;
    }
}