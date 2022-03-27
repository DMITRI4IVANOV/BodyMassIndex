public class BodyMassIndex {
    public int calculate(int growth, int mass) {
        int growth1 = growth * growth;
        int growth2 = growth1 / (int) 10000.0;
        int index = mass / growth2;
        int a = (int) 18.5;
         int b = 25;
        if (index < a) {
            System.out.println("Дефицит массы! ");
        } else { if (index > b) {
            System.out.println("Избыточный вес! ");
        }
         else { System.out.println("Норма! ");
         }
         }
        return index;
    }
    }

