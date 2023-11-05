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

            if(stackFull.firstElement()>=stackEmpty.firstElement()){
                stackEmpty.push(stackFull.pop());

            } else {

                int turn = 0;
                temp = stackFull.pop();

                while (temp < stackEmpty.firstElement()){
                    stackFull.push(stackEmpty.pop());
                    turn++;
                }

                for (int i = 0; i < turn; i++) {
                    stackEmpty.push(stackFull.pop());
                }

                stackEmpty.push(temp);
            }
        }
    }



}