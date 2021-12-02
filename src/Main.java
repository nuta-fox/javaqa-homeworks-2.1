public class Main {
    public static void main(String[] args) {
        int amount = 100; // цена одного билета
        int rubles = 20; // Сумма для начисления бонуса
        int amountTickets = 4; // Количество купленных билетов
        int miles = amount * amountTickets / rubles;

        System.out.println(miles);

    }
}

