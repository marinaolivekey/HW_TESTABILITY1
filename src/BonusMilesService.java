public class BonusMilesService {
    public int calculate(int price) {
        int milesPrice = 20;
        int bonus = price / milesPrice;
        return bonus;
    }
}
