public class Wizard extends Enemy{
    String type;
    public Wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    void damageType(){
        //if the type of wizard is 'fire', then print "this wizard shoots a fireball"
        //if the type is 'ice', then print "this wizard shoots an iceball"
        if (this.type == "fire"){
        System.out.println("this wizard shoots a fireball");    
        } else {
            System.out.println("this wizard shoots an iceball");
        }
       
    }
}