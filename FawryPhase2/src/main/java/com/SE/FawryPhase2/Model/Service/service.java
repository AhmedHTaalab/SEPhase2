package com.SE.FawryPhase2.Model.Service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public abstract class service {
	ArrayList<String> Types = new ArrayList<String>() ;
	public int amount;
	public void set_Types(String t)
	{
		Types.add(t);
	}
	public String get_Types(String s)
	{   int x=0;
		for(int i=0;i<Types.size();i++)
			if (Types.get(i)==s)
				x=i;
		return Types.get(x)+"\n";
	}
	public void delete_type(String t)

	{
		for(int i=0;i<Types.size();i++)
		{
			if(Types.get(i)==t)
				Types.remove(i);

		}
	}
}