import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Check {
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Ramen> ramenList = createRamenList();
        List<Customer> customerList = createCustomerList();

        for (int i = 0; i < ramenList.size(); i++) {

            System.out.println(ramenList.get(i).getTaste() + "らーめん１丁！");
            String customerStomach = customerList.get(i).getStomachCondition();

            if ("ぺこぺこ".equals(customerStomach)) {
                orderKaedama(ramenList.get(i), random.nextInt(3));
            } else {
                System.out.println(i + 1 + "人目のお会計は" + ramenList.get(i).getPrice() + "円です");
            }
        }
    }

    private static List<Ramen> createRamenList() {
        List<Ramen> ramenList = new ArrayList<>();
        ramenList.add(new Ramen("豚骨", 800, 0));
        ramenList.add(new Ramen("醤油", 700, 0));
        ramenList.add(new Ramen("醤油", 700, 0));
        return ramenList;
    }

    private static List<Customer> createCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("ぺこぺこ"));
        customerList.add(new Customer("ぺこぺこ"));
        customerList.add(new Customer("いっぱい"));
        return customerList;
    }

    private static void orderKaedama(Ramen ramen, int quantity) {
        int totalPrice = ramen.getPrice() + (quantity * 100);
        System.out.println("お会計は" + totalPrice + "円です");
    }
}