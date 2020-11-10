import java.util.Scanner;
public class TicketMachine
{
    int price;
    int balance;
    int total;

    TicketMachine(int price1) { price = price1; }
    void insertMoney(int amount) { balance += amount; }
    int getBalance() { return balance; }
    void printTicket() {
        System.out.println ("请输入需要打印的票数:");
        Scanner In = new Scanner(System.in);
        int num = In.nextInt();
        if (getBalance() < (num*price)) {
            System.out.println("余额不足，请充值！");
            return;
        }

        for (int i=0; i<num; i++)
        {
            System.out.println("==============================");
            System.out.println("This is a ticket");
            System.out.println("price : " + price);
            System.out.println("==============================");
            balance -= price;
            total += price;
        }
    }

    int refund() {
        int result = balance;
        balance = 0;
        return result;
    }

    int getTotal() { return total; }
    void reset() { balance = 0; total = 0; }
}