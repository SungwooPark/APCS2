//Sungwoo Park
//APCS2/PD9
//2014-04-10
//HW#28

import java.util.*;

public class LLStack<T> implements Stack<T>{
    
    public LinkedList<T> _stack;

    public LLStack(){
	_stack = new LinkedList<T>();
    }	

    public void push(T x){
	_stack.add(x);
    }

    public T pop(){
	if (_stack.size() == 0){
	     return null;
	}
	return _stack.removeLast();
    }

    public T peek(){
	return _stack.getLast();
    }

    public static void main(String[] args){
	LLStack myStack = new LLStack<String>();
	myStack.push("Hello");
	myStack.push("World");
	System.out.println(myStack.peek());
	System.out.println(myStack.pop());
	System.out.println(myStack.pop());
	System.out.println(myStack.pop());
    }
}
