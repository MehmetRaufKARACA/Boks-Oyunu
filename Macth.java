public class Macth{

        Fighter f1;
        Fighter f2;
        int minWeight;
        int maxWeight;

        Macth(Fighter f1, Fighter f2, int minWeight, int maxWeight){
            this.f1 = f1;
            this.f2 = f2;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;

        }

        void start(){
           if(isCheck()){
               while(f1.health > 0 && f2.health > 0){
                    System.out.println("====NEW ROUND====");
                    this.f2.health = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                    
                    this.f1.health = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f1.name + " kalan sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " kalan sağlık : " + this.f2.health);
               }      
           }else{
                System.out.println("Uygun siklette olmayan sporcu var.");
           } 
            
        }

        boolean isCheck(){
            return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
        }

        boolean isWin(){

            if(f1.health == 0){
                System.out.println(this.f2.name + " kazandı");
                return true;
            }

            if(f2.health == 0){
                System.out.println(this.f1.name + " kazandı");
                return true;
            }
                return false;

        }

       

}