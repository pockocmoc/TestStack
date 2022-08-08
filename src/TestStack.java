import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {

        Stack<Integer> mystact1 = new Stack<>();
        Stack<Integer> mystact2 = new Stack<>();

        for (int i = 0; i < 10; i++) mystact1.push(i);
        for (int i = 10; i < 20; i++) mystact2.push(i);

        System.out.println("Стек в mystack1: ");
        for (int i = 0; i < 10; i++)
          System.out.println(mystact1.pop());

        System.out.println("Стек в mystack2: ");

        for (int i = 0; i < 10; i++)
        System.out.println(mystact2.pop());





        }

        }

