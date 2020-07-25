package collections_task;

public class AddItem
{
	int[] idNumbers= {1,2,3,4,5,6,7,8,9,10};
	int[] sectionNumbers= {1,1,1,1,2,2,2,3,3,3};
	String[] names= {"Ram","Rani","Meghana","Sita","Bhavitha","Lokesh","Kumar","Satish","Prathyu","Nagi"};
	String[] branches= {"CSE","ECE","CSE","EEE","CSE","ECE","EEE","ECE","CSE","CSE"};
 	public void addInitialElements()
	{
		for(int items=0;items<10;items++)
		{
		  CustomArrayList.customList.add(new CustomArrayList(idNumbers[items],sectionNumbers[items],names[items],branches[items]));
		}
	}
	public void addItem(int idNumber,int sectionNumber,String name,String branch)
	{
		 CustomArrayList.customList.add(new  CustomArrayList(idNumber,sectionNumber,name,branch));
	}

}
