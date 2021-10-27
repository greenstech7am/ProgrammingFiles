package org.tcs;

public class ChildClassMethod extends CallingParentClassMethod{
	
	
	@Override
	public void empId() {
		// TODO Auto-generated method stub
		super.empId();
	}
	
	
	public static void main(String[] args) {
		
		
		
		CallingParentClassMethod c = new CallingParentClassMethod();
		c.empId();
	}


}
