package ast;

import java.util.*;
import java.lang.RuntimeException;

public class Scope{

	private List<HashMap<String, Expression>> aScopeList;
	private List<HashMap<String, Expression>> aFuncList;
	
	public Scope(){
//		System.out.println("Instantiating scope object");
		this.aScopeList = new ArrayList<HashMap<String, Expression>>();
		this.aFuncList = new ArrayList<HashMap<String, Expression>>();
	}
	
	public List<HashMap<String, Expression>> getScopeList(){
		return this.aScopeList;
	}
	
	public List<HashMap<String, Expression>> getFuncList(){
		return this.aFuncList;
	}
	
	public void scopeBegin(){
	//	System.out.println("Entering scope");
		this.aScopeList.add( 0, new HashMap<String, Expression>() );
	}
	
	public void funcBegin(){
	//	System.out.println("Entering scope");
		this.aFuncList.add( 0, new HashMap<String, Expression>() );
	}
	
	public void scopeEnd(){
	//	System.out.println("Leaving scope");
		this.aScopeList.remove(0);
	}
	
	public void funcEnd(){
	//	System.out.println("Leaving scope");
		this.aFuncList.remove(0);
	}
	
	public void letIn(String pName, Expression exp){
	//	System.out.println("Adding variable: " + pName);
		if(this.aScopeList.get(0).get(pName) == null){
			(this.aScopeList.get(0)).put(pName, exp);
		}
		else{
			throw new RuntimeException("Variable "+pName+" is already defined");
		}
	} 
	
	public void funcIn(String pName, Expression exp){
	//	System.out.println("Adding variable: " + pName);
		if(this.aFuncList.get(0).get(pName) == null){
			(this.aFuncList.get(0)).put(pName, exp);
		}
		else{
			throw new RuntimeException("Function "+pName+" is already defined");
		}
	} 
	
	
	public void replaceIn(String name, Expression exp){
		if(this.aScopeList.get(0).get(name) != null){
			(this.aScopeList.get(0)).put(name, exp);
		}
		else{
			throw new RuntimeException("Variable or function "+name+" is not delcared");
		}		
	}
	
	public Expression getVar(String pName){
	//	System.out.println("Hello, World!");
		for (HashMap<String, Expression> hp : aScopeList){
	//		System.out.println("Processing scope: " + hp.toString());
			if(hp.get(pName) != null){
				return hp.get(pName);
			}
		}
		throw new RuntimeException("Unbounded variable : "+pName);
	}
	
	public Expression getFunc(String pName){
	//	System.out.println("Hello, World!");
		for (HashMap<String, Expression> hp : aFuncList){
	//		System.out.println("Processing scope: " + hp.toString());
			if(hp.get(pName) != null){
				return hp.get(pName);
			}
		}
		throw new RuntimeException("Unbounded function : "+pName);
	}
}
