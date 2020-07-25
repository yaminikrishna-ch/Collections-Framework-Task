package collections_task;

import java.util.ArrayList;

public class CustomArrayList {
	int idNumber;
	int sectionNumber;
	String name;
	String branch;
	CustomArrayList(int idNumber,int sectionNumber,String name,String branch)
	{
		this.idNumber=idNumber;
		this.sectionNumber=sectionNumber;
		this.name=name;
		this.branch=branch;
	}
    static ArrayList<CustomArrayList> customList=new ArrayList<CustomArrayList>();
}
