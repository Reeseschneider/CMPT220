import java.util.Random;

public class student {
 String name;
 String year;
 double gpa;
 int id;
 public student(String n, String y, double g, int i){
 name = n;
 year = y;
 gpa = g;
 id = i;
 }
void isHonorRoll(){
    if(this.gpa >= 3.6){
        System.out.println(this.name + " is honor roll student");
    } else {
        System.out.println(this.name + " is not honor roll student");
    }
}
void isFreeLunch(int randomId){
    if(this.id == randomId){
        System.out.println(this.name + " gets free lunch");
    } else {
        System.out.println(this.name + " does not get free lunch");
    }
}
}
