public class Main {
    public static void main(String[] args) {
        int cost = 8000; /*стоимость билета 8000 руб. */
        int promotion = 20; /*сумма, которую нужно потратить для начисления 1 мили*/
        int miles = cost/promotion; /* количество бонусных миль*/
        System.out.println("Вам начислено: " + miles + " бонусов");
    }
}
