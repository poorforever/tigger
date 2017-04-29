package ast;

import java.util.*;
import java.lang.RuntimeException;

public class Scope{

	private List<HashMap<String, Integer>> aScopeList;
	
	public Scope(){
//		System.out.println("Instantiating scope object");
		this.aScopeList = new ArrayList<HashMap<String, Integer>>();
	}
	
	public List<HashMap<String, Integer>> getScopeList(){
		return this.aScopeList;
	}
	
	public void scopeBegin(){
	//	System.out.println("Entering scope");
		this.aScopeList.add( 0, new HashMap<String, Integer>() );
	}
	
	public void scopeEnd(){
	//	System.out.println("Leaving scope");
		this.aScopeList.remove(0);
	}
	
	public void letIn(String pName, int pVal){
	//	System.out.println("Adding variable: " + pName);
		if(this.aScopeList.get(0).get(pName) == null){
			(this.aScopeList.get(0)).put(pName, pVal);
		}
		else{
			throw new RuntimeException("Variable "+pName+" is already defined");
		}
	} 
	
	public int getVar(String pName){
	//	System.out.println("Hello, World!");
		for (HashMap<String, Integer> hp : aScopeList){
	//		System.out.println("Processing scope: " + hp.toString());
			if(hp.get(pName) != null){
				return hp.get(pName);
			}
		}
		throw new RuntimeException("Unbounded variable");
	}
	
}
