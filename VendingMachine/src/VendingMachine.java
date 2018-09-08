import java.util.HashMap;

public class VendingMachine {
    private HashMap<String, Integer> snacks;

    public Payment payment = new Payment() {
        @Override
        public void buy(String snack, int quantity, Person p) {
            if (snacks.get(snack) >= quantity) {
                switch (snack) {
                    case "Kit-Kat":
                        if (takeMoney(10, quantity, p)) {
                            snacks.put(snack, snacks.get(snack) - quantity);
                            System.out.println("Kit-Kat purchased");
                        }
                        break;
                    case "Coca-Cola":
                        if (takeMoney(20, quantity, p)) {
                            snacks.put(snack, snacks.get(snack) - quantity);
                            System.out.println("Coca-Cola purchased");
                        }
                        break;
                    case "Soda":
                        if (takeMoney(5, quantity, p)) {
                            snacks.put(snack, snacks.get(snack) - quantity);
                            System.out.println("Soda purchased!");
                        }
                        break;
                    default:
                        break;
                }
            }
            else if(snacks.get(snack) < quantity && snacks.get(snack) != 0){
                System.out.println("There are only " + snacks.get(snack) + " stocks left");
            }
            else {
                System.out.println("There is no more " + snack);
            }
        }

        @Override
        public boolean takeMoney(int price, int quantity, Person p) {
            if (p.money < price * quantity) {
                System.out.println("Hey, " + p.name + " not enough money!");
                return false;
            } else {
                p.money -= price * quantity;
                System.out.println("Transaction successful!");
                return true;
            }
        }
    };

    public void addSnack(String name, int quantity) {
        snacks.put(name, quantity);
    }

    public void purchase(String snack, int quantity, Person p) {
        payment.buy(snack, quantity, p);
    }

    public VendingMachine() {
        // Initialize snacks
        snacks = new HashMap<String, Integer>();
        snacks.put("Kit-Kat", 10);
        snacks.put("Coca-Cola", 5);
        snacks.put("Soda", 25);
    }
}
