public class BonusMilesService {
   int calculate(int cost){
       int promotion = 20; /*сумма, которую нужно потратить для начисления 1 мили*/
       int miles = cost / promotion;
       return miles;
   }
}
