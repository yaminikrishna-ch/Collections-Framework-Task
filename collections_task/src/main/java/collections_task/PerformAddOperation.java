package collections_task;

public class PerformAddOperation extends PerformOperations{

	public void performAddOperation()
	{
	  AddItem addRecord=new AddItem();
	  logger.debug("Enter the Id Number of the Student");
	  int idNumber=sc.nextInt();
	  logger.debug("Enter the Section Number of the Student");
	  int sectionNumber=sc.nextInt();
	  logger.debug("Enter the Name of the Student");
	  String name=sc.next();
	  logger.debug("Enter the Branch in which the Student Enrolled");
	  String branch=sc.next();
	  addRecord.addItem(idNumber,sectionNumber,name,branch);
	}
}
