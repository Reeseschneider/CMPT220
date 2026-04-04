import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        student s1 = new student("reese", "junior", 4.0, 1);
        student s2 = new student("matt", "junior", 3.8, 2);
        student s3 = new student("amanda", "sophomore", 3.6, 3);
        student s4 = new student("joe", "junior", 3.0, 4);
        student s5 = new student("kate", "junior", 2.8, 5);
    

       s1.isHonorRoll();
       s2.isHonorRoll();
       s3.isHonorRoll();
       s4.isHonorRoll();
       s5.isHonorRoll();

       Random rand = new Random();
       int randomId= rand.nextInt(5)+1;

       s1.isFreeLunch(randomId);
       s2.isFreeLunch(randomId);
       s3.isFreeLunch(randomId);
       s4.isFreeLunch(randomId);
       s5.isFreeLunch(randomId);
    }
}
//I learned how to create methods to repeat tasks
//I also learned how to use classes to group data together
//I also learned how to use random numbers and compare values
