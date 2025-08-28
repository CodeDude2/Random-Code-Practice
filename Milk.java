package Opp;
public class Milk {
    private String milk;
    private String compare = "chocolate";
        public Milk(String type){
            setMilk(type);
            checkmilk();
        }

        public String getMilk(){
            return this.milk;
        }

        public void setMilk(String val){
            this.milk = val;
        }
       
        private void checkmilk(){
            if(compare.equals(getMilk())){
                System.out.println(getMilk());
            }
            else{
                System.out.println("no milk");;
            }
        }

        
}
