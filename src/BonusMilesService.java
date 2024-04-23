public class BonusMilesService {

    public int calculate(int price) {
        int miles = price / 20;
        if (miles > 500) {
            miles = 500;
        }
        return miles;
    }
}
