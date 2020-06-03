package br.com.auto.tool.interfaces;

import org.openqa.selenium.By;

public interface Scroll {

	public void scrolElementAction(By by);
	
	public void scrolElementJS(By by);

	public void scrolElement(By by, int secons);


}
