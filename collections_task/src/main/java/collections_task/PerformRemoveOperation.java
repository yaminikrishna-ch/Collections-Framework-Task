package collections_task;

public class PerformRemoveOperation extends PerformOperations{
	public void performRemoveOperation()
	{
		RemoveItem removeRecord=new RemoveItem();
		logger.debug("Enter the Index of the Record to be Removed");
		int index=sc.nextInt();
		removeRecord.removeItem(index);
	}

}
