package collections_task;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FetchItem {
	final Logger logger=LogManager.getLogger(PerformOperations.class);
	public void fetchItem(int index)
	{
		logger.debug("IdNumber: {}.",CustomArrayList.customList.get(index).idNumber);
		logger.debug("SectionNumber: {}.",CustomArrayList.customList.get(index).sectionNumber);
		logger.debug("Name: {}",CustomArrayList.customList.get(index).name);
		logger.debug("Branch: {}",CustomArrayList.customList.get(index).branch);
	}
}
