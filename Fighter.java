public class Fighter {
    
    String name;
    int damage;
    int health;
    int weight;
    int block;
    int firstPunch;


    Fighter(String name, int damage, int health, int weight, int block, int firstPunch){

        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(this.block >= 0 && this.block <= 100 ){
            
            this.block = block;
        }else{
            this.block = 0;
        }

        if(this.firstPunch >= 0 && this.firstPunch <= 100){
            this.firstPunch = firstPunch;
        }else{
            this.firstPunch = 0;
        }
    }

    int hit(Fighter rival){
        System.out.println(this.name + "=>" + rival.name + "'e " + this.damage + " hasar vurdu.");

        if(rival.isBlock()){
            System.out.println(rival.name + " yumruğu blokladı.");
            System.out.println("---------------");
            return rival.health;
        }

        if(rival.health - this.damage < 0){
            return 0;
        }

        return rival.health - this.damage;        
    }

    boolean isBlock(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.block;
    }

    boolean isFirst(){
        double chance = Math.random() * 100;
        return chance <= this.firstPunch;
    }


}
