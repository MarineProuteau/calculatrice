package sdc;

import java.util.Stack;

public class ViewSymbol implements Symbol{
	
	public boolean parse(String s) {
		return s.equals("view");
	}
	
	public void execute(Stack<Value> s) throws ShutdownException {
		int position = s.size();
		for (Value v : s){
			System.out.print(position + " ----> " + v + "\n");
			position -= 1;
			
		}
	}
}
