package ast;

import java.util.*;

public class Scope{

	private List<HashMap<String, Integer>> aScopeList;
	
	public Scope(){
		this.aScopeList = new ArrayList<HashMap<String, Integer>>();
	}
	
	public List<HashMap<String, Integer>> getScopeList(){
		return this.aScopeList;
	}
	
	public void scopeBegin(){
		this.aScopeList.add( 0, new HashMap<String, Integer>() );
	}
	
	public void scopeEnd(){
		this.aScopeList.remove(0);
	}
	
	public void letIn(String pName, int pVal){
		this.scopeBegin();
		(this.aScopeList.get(0)).put(pName, pVal);
	} 
	
	public int getVar(String pName){
		for (HashMap<String, Integer> hp : aScopeList){
			if(hp.get(pName) != null){
				return hp.get(pName);
			}
		}
		return Integer.MAX_VALUE;
	}
	
}
