public class Lader
{
    double upper_line;
    double lower_line;
    double hight;

    Lader(int a, int b, int h){ upper_line = a; lower_line = b; hight = h;}
    double doArea()
    {
        double area;
        area = (upper_line + lower_line) * hight / 2;
        return area;
    }
}