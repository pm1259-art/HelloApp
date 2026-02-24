import java.util.Scanner;
public class OnlineOrderBilling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order amount: ");
        double orderAmount = sc.nextDouble();

        System.out.print("Is Prime Member (true/false): ");
        boolean isPrimeMember = sc.nextBoolean();

        System.out.print("Enter items count: ");
        int itemsCount = sc.nextInt();

        double discount = 0;
        double shipping = 0;
        double finalAmount = 0;
        if (orderAmount <= 0 || itemsCount <= 0) {
            System.out.println("Invalid Input");
            return;
        }
        if (isPrimeMember) {
            discount = orderAmount * 0.05;
        }

        double amountAfterDiscount = orderAmount - discount;

        if (amountAfterDiscount >= 1000) {
            shipping = 0;
        } else {
            shipping = 50;
        }

        finalAmount = amountAfterDiscount + shipping;

        if (finalAmount > 5000) {
            finalAmount = finalAmount - (finalAmount * 0.02);
        }

        System.out.println("Final Payable Amount: " + finalAmount);

        sc.close();
    }
}