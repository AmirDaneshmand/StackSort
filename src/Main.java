import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class Main {
    Stack<Integer> stackFull  = new Stack<>();
    Stack<Integer> stackEmpty  = new Stack<>();

    int temp;

    public void stackSorting(){
        if(stackFull.empty()){
            return;
        }

        stackEmpty.push(stackFull.pop());

        while (!stackFull.empty()){

            if(stackFull.peek()>=stackEmpty.peek()){
                stackEmpty.push(stackFull.pop());

            } else {

                int turn = 0;
                temp = stackFull.pop();

                while (temp < stackEmpty.peek()){
                    stackFull.push(stackEmpty.pop());
                    turn++;
                }
                stackEmpty.push(temp);
                for (int i = 0; i < turn; i++) {
                    stackEmpty.push(stackFull.pop());
                }


            }
        }
    }


    public static void main(String[] args) {
        Main testMain = new Main();

        testMain.stackFull.push(8);
        testMain.stackFull.push(3);
        testMain.stackFull.push(9);
        testMain.stackFull.push(1);
        System.out.println(testMain.stackFull);
        testMain.stackSorting();
        System.out.println(testMain.stackEmpty);
    }
}