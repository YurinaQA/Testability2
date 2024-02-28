public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87; //м Рост
        int weight = 98; //кг Вес

        int bodyMassIndex = (int) service.calculate(height, weight);
        System.out.println("Индекс массы тела = " + bodyMassIndex);
    }
}