package br.com.auto.tool.interfaces;

import org.openqa.selenium.By;

public interface Capture {
	
	public String captureText(By by);

	public String captureText(By by, int seconds);

	
	
}
