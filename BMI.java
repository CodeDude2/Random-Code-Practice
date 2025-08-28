public class BMI {
    private double weight;
    private double height;
    public static final double Kilo_Per_Pound = 0.45359237;
    public static final double Meters_Per_INCH = 0.0254;

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getBMI(){
        double bmi = this.weight*Kilo_Per_Pound/((height*Meters_Per_INCH)*(this.height*Meters_Per_INCH));
        return Math.round(bmi* 100)/100.0;
    }
    public String calculate(){
        double bmi =this.getBMI();
        System.out.print("Your BMI is: ");
        if(bmi<18.5){
            return "You are skinny";
        }
        else if(bmi<25){
            return "You are normal";
        }
        else if(bmi<30){
            return "You are fat";
        }
        else{
            return "You are obese";
        }
    }
}
