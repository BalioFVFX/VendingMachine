public class Entry {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        Person person = new Person("Pesho", 150);

        System.out.println(person.name + " has " + person.money + " money left!");
        vendingMachine.purchase("Coca-Cola", 1, person);
        vendingMachine.purchase("Coca-Cola", 1, person);
        vendingMachine.purchase("Coca-Cola", 1, person);
        vendingMachine.purchase("Coca-Cola", 1, person);
        vendingMachine.purchase("Coca-Cola", 1, person);
        vendingMachine.purchase("Coca-Cola", 1, person);
        vendingMachine.purchase("Coca-Cola", 1, person);
        System.out.println(person.name + " has " + person.money + " money left!");

    }
}
