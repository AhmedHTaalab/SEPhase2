package com.SE.FawryPhase2.Model.Service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public abstract class service {
	ArrayList<String> Types = new ArrayList() ;
	private int amount;
	private int ID;
	public void set_Types(String t)
	{
		Types.add(t);
	}
	public ArrayList<String> get_Types()
	{
		return Types;
	}

	public void delete_type(String t)

	{
		for(int i=0;i<Types.size();i++)
		{
			if(Types.get(i)==t)
				Types.remove(i);

		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
}