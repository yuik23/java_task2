import java.util.ArrayList;

public class Check {
    public static void main(String[] args) {
        Ramen ramen1 = new Ramen("豚骨", 800, 0);
        Ramen ramen2 = new Ramen("醤油", 700, 0);
        Ramen ramen3 = new Ramen("醤油", 700, 0);

        Customer customer1 = new Customer("ぺこぺこ");
        Customer customer2 = new Customer("ぺこぺこ");
        Customer customer3 = new Customer("いっぱい");

        ArrayList<Ramen> ramenList = new ArrayList<>();
        ramenList.add(ramen1);
        ramenList.add(ramen2);
        ramenList.add(ramen3);

        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

//        おなかぺこぺこなら替え玉+1してお会計、いっぱいなら替え玉せずお会計
        for (int i = 0; i < ramenList.size(); i++) {
            System.out.println(ramenList.get(i).getTaste() + "らーめん１丁！");
            if (customerList.get(i).getStomachCondition().equals("ぺこぺこ")) {
                ramenList.get(i).setKaedama(ramenList.get(i).getKaedama() + 1);
                System.out.println(i + 1 + "人目のお会計は" + (ramenList.get(i).getPrice() + ramenList.get(i).getKaedama() * 100) + "円です");
            } else {
                System.out.println(i + 1 + "人目のお会計は" + ramenList.get(i).getPrice() + "円です");
            }
        }
    }
}
