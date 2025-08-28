package Opp;

public class Client {
    public static void main(String[] args) {
        Practice cheese = new Practice.Builder().fat(2).protien(7).calories(60).sodium(4).build();
        Milk m = new Milk("chocolate");
        Dog d = new Dog("Husky", 5, "White");


        
        String info = cheese.toString();
        System.out.println(info);
        
    }
}
