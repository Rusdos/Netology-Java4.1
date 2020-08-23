public class Main {
    public static void main(String[] args) {
        double cost = 8000.50; /*стоимость билета */
        int promotion = 20; /*сумма, которую нужно потратить для начисления 1 мили*/
        int miles;
        if (cost >= 0) {
            miles = (int) cost / promotion; /* количество бонусных миль*/
            System.out.println("Бонусов начислено: " + miles);
        } else {
            System.out.println("Стоимость билета не может быть отрицательной. Пожалуйста, введите положительное число.");
        }


    }
}
