public class BmiService {
    public double calculate(int height, int weight) {
        double bmi = weight / Math.pow (height, 2);
        return bmi;
    }
}

