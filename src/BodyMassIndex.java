public class BodyMassIndex {
    public int calculate(int growth, int mass) {
        int growth1 = growth * growth;
        int growth2 = growth1 / (int) 10000.0;
        int index = mass / growth2;
        return index;
    }
}

