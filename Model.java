public class Model {
    public Model() {
    }

    public double HitungBMI(double Tinggi, double Berat) {
        return Berat / ((Tinggi/100 * Tinggi/100));
    }

    public String StatusBMI(double BMI) {
        if (BMI < 18.5) {
            return "Underweight";
        } else if (BMI < 25) {
            return "Normal";
        } else if (BMI < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
