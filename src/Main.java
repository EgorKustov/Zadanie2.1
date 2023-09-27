public class Main {
    public static void main(String[] args) {

        int startingBalance = 100;
        int replenishment = 2000;

        int bonus;
        if (1000 <= replenishment) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int Balance = (startingBalance + replenishment + bonus);
        System.out.println("Ваш баланс " + Balance + " рублей");
        System.out.println("Начислено бонусами " + bonus + " рублей");

    }
}
