package Opp;

    public class Practice {

        private final int fat;
        private final int sodium;
        private final int calories;
        private final int protien;

        private Practice(Builder builder) {
            this.fat = builder.fat;
            this.sodium = builder.sodium;
            this.calories = builder.calories;
            this.protien = builder.protien;
        }

        public static class Builder {
            private int fat;
            private int sodium;
            private int protien;
            private int calories;
            
            
            public Builder protien(int val){
                this.protien = val;
                return this;
            }
            public Builder calories(int val) {
                this.calories = val;
                return this;
            }
            public Builder fat(int val) {
                this.fat = val;
                return this;
            }
            public Builder sodium(int val){
                this.sodium= val;
                return this;
            }

            public Practice build() {
                return new Practice(this);
            }
        }

        @Override
        public String toString() {
        return "Practice [fat=" + fat + ", sodium=" + sodium + ", calories=" + calories + ", protien="+ protien+"]";
    }

}
