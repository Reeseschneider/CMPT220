import java.util.Stack;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
       
        int max = stax.peek(); 
        int min = stax.peek();
        int count = 0;

    while (!stax.isEmpty()) {
    int num = stax.pop();
    count ++;

    if (num > max) {
        max = num;
    }
    if (num < min) {
        min = num;
    }
}
        System.out.println("max :" + max);
        System.out.println("min :" + min);
        System.out.println("size: " + count);
       
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

    int middle = linky.size()/2;
    System.out.println("Middle value: " + linky.get(middle));


    LinkedList<String> link = new LinkedList<>();
     System.out.println("Alphabetical Name List");
      link.add("Abby");
      link.add("Brooke");
      link.add("Chloe");
      link.add("Emmy");
      System.out.println(link);
      link.add(3, "Debby");
      System.out.println(link);
      link.remove("Chloe");
      System.out.println(link);
      System.out.println("First name on class list: " + link.get(0));
    }
}
