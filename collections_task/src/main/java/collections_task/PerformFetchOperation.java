package collections_task;

public class PerformFetchOperation extends PerformOperations{
	
	public void performFetchOperation()
	{
		FetchItem fetchRecord=new FetchItem();
		logger.debug("Enter the Index of the Record to be Fetched");
		int index=sc.nextInt();
		fetchRecord.fetchItem(index);
	}
}
