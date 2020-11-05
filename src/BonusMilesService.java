public class BonusMilesService {
    public int calculate(int cost) {
        int priceBonus = 20;
        int miles = cost / priceBonus;
        return miles;
    }
}


