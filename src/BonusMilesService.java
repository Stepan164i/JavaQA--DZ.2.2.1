public class BonusMilesService {
    public int calculate(int cost) {
        int priceBonus = 20;
        int miles = cost / priceBonus;
        System.out.println(miles);
        return miles;
    }
}


