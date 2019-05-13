package mergeLeadPages;

import design.ProjectMethods;

public class Alert_merge_i extends ProjectMethods{
	
	 public Alert_merge_i Alert_i() throws InterruptedException {
	 driver.switchTo().alert().accept();
	 Thread.sleep(1000);
	 System.out.println("Merge lead- Success");
	 return this;
}
}