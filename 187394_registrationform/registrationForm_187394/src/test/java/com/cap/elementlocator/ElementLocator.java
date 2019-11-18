package com.cap.elementlocator;

import org.openqa.selenium.By;

public class ElementLocator {
	public static By Userid = By.xpath("//*[@id=\"usrID\"]");
	public static By Password = By.xpath("//*[@id=\"pwd\"]");
	public static By Name = By.xpath("//*[@id=\"usrname\"]");
	public static By Address = By.xpath("//*[@id=\"addr\"]");
	public static By Country = By.xpath("/html/body/form/ul/li[10]/select");
	public static By Zipcode = By.xpath("/html/body/form/ul/li[12]/input");
	public static By Email = By.xpath("/html/body/form/ul/li[14]/input");
	public static By Sex = By.xpath("/html/body/form/ul/li[17]/input");
	public static By Language = By.xpath("/html/body/form/ul/li[19]/input");
	public static By About = By.xpath("//*[@id=\"desc\"]");
    public static By Submit = By.xpath("/html/body/form/ul/li[23]/input");
    public static By Title = By.xpath("/html/body/h1");
}
