package Opp;

class Dog{
    String breed;
    int age;
    String color;
    public Dog(String breed, int age, String color){
        setBreed(breed);
        setAge(age);
        setColor(color);
        printDog();
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setAge(int age){
        this.age = age;
        
    }
    public void setColor(String color){
        this.color = color;
    }
    public void printDog(){
        System.out.println(this.age);
        System.out.println(this.color);
        System.out.println(this.breed);
    }
    
}
