package collections_task;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PerformOperations{
	Scanner sc=new Scanner(System.in);
	final Logger logger=LogManager.getLogger(PerformOperations.class);
	public void performAddInitialElements()
	{
		AddItem addRecord=new AddItem();	
		addRecord.addInitialElements();	
	}
	public void performAllOperations() throws Exception
	{
		String choice="";
	 do{
		logger.debug("Enter number of Operation You Want to Perform:");
		logger.debug("1.AddItem");
		logger.debug("2.RemoveItem");
		logger.debug("3.FetchItem");
		int option=sc.nextInt();
		if(option==1)
		{
			PerformAddOperation performAdditionOperation=new PerformAddOperation();
			performAdditionOperation.performAddOperation();
		}
		else if(option==2)
		{
			PerformRemoveOperation performRemovingOperation=new PerformRemoveOperation();	
			performRemovingOperation.performRemoveOperation();
		}
		else if(option==3)
		{
			PerformFetchOperation performFetchingOperation=new PerformFetchOperation();
			performFetchingOperation.performFetchOperation();
		}
		else
		{
			throw new InputMismatchException();
		}
		logger.debug("Do You want to Continue?(yes/no)");
	    choice=sc.next();
	 }while(choice.equals("yes"));
	}
	public static void main(String[] args) throws Exception {
		PerformOperations performOperations=new PerformOperations();
		performOperations.performAddInitialElements();
		performOperations.performAllOperations();
		
	}
}
