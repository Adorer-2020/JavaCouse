import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入梯形的上底：");
        int a = scanner.nextInt();
        System.out.println("请输入梯形的下底：");
        int b = scanner.nextInt();
        System.out.println("请输入梯形的高：");
        int h = scanner.nextInt();
        Lader laber = new Lader(a,b,h);
        System.out.println("该梯形的面积为：" + laber.doArea() );
        System.out.println("请输入圆的半径：");
        int r = scanner.nextInt();
        Circle circle = new Circle(r);
        System.out.println("该圆的面积为：" + circle.doArea());
    }
}
