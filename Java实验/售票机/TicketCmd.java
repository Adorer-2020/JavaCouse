import java.util.Scanner;

public class TicketCmd {
    public static void main(String[] args) {
        int price = 500;
        TicketMachine ticketMachine = new TicketMachine(price);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean quitFlag = false;
            System.out.println("===============欢迎使用自动售票机===============");
            System.out.println("          本机销售固定票价 " + price + " 元的车票     ");
            while (true) {
                System.out.println("==============================================");
                System.out.println("1、投币");
                System.out.println("2、打印车票");
                System.out.println("3、找零");
                System.out.println("4、总营业额");
                System.out.println("reset 重置");
                System.out.println("turn off 关机");
                System.out.println("==============================================");
                System.out.println("请输入您的选择：");
                String input = scanner.nextLine();
                switch (input) {
                    case "1":
                        System.out.println("请输入投币的数量：");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        if (amount < 0)
                            System.out.println("输入金额有误！");

                        ticketMachine.insertMoney(amount);
                        System.out.println("当前余额：" + ticketMachine.getBalance() + " 元");
                        break;
                    case "2":
                        ticketMachine.printTicket();
                        System.out.println("当前余额：" + ticketMachine.getBalance() + " 元");
                        if (ticketMachine.getBalance() == 0)
                            quitFlag = true;
                        break;
                    case "3":
                        System.out.println("应找零 " + ticketMachine.refund() + " 元");
                        quitFlag = true;
                        break;
                    case "reset":
                        System.out.println("本次营业总额 " + ticketMachine.getTotal() + " 元");
                        ticketMachine.reset();
                        System.out.println("============本机被重置============");
                        quitFlag = true;
                        break;
                    case "turn off":
                        System.exit(0);
                    case "4":
                        System.out.println ("总收入为："+ ticketMachine.getTotal()+"元");

                    default:
                        System.out.println("请输入正确的功能序号");
                }
                if (quitFlag) {
                    break;
                }
            }
        }

    }

}