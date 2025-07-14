public class BMI {
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static void main(String[] args) {

        System.out.println(calculateBMI(1.524, 45));
    }
}
