public interface Payment {
    void buy(String snack, int quantity, Person p);
    boolean takeMoney(int price, int quantity, Person p);
}
