public class BMIClient {
    public static void main(String[] args){
        BMI bmi = new BMI(160,68);

        double value = bmi.getBMI();
        String state = bmi.calculate();
        System.out.println(value);
        System.out.println(state);

    }
}
