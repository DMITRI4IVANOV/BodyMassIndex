public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int indexNormal = service.calculate(165, 50);
        System.out.println("Ваш индекс массы: " + indexNormal);

        int indexDeficit = service.calculate(180, 40);
        System.out.println("Ваш индекс массы: " + indexDeficit);

        int indexExcess = service.calculate(165, 80);
        System.out.println("Ваш индекс массы: " + indexExcess);
    }
}
