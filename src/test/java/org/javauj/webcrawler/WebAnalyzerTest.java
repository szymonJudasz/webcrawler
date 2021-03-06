package org.javauj.webcrawler;

import java.io.IOException;
import java.net.URL;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class WebAnalyzerTest extends TestCase{
	public WebAnalyzerTest(String testName)
	{
		super(testName);
	}
	public static Test suite()
	{
		return new TestSuite(WebAnalyzerTest.class);
	}
	public void testGetSizeHtmlPage()
	{
		URL url = null;
		WebAnalyzer obj = new WebAnalyzer();
		try
		{
			url = new URL("http://szymon.judasz.student.tcs.uj.edu.pl/");
		} catch (IOException e)
		{
			e.printStackTrace();
			assertTrue(false);
		}
		Integer result = obj.getPageSize(url);
		assertEquals(new Integer(41), result);
	}

	/*public void testAnalyzePageWithNoImages()
	{
		URL url = null;
		WebAnalyzer obj = new WebAnalyzer();
		try
		{
			url = new URL("http://bash.org.pl/");
		} catch (IOException e)
		{
			e.printStackTrace();
			assertTrue(false);
		}
		try {
			AnalyzeResult result = obj.analyzePage(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//assertEquals(new Integer(41), result);
		assertTrue(true);
	}
	public void testHttpsConnection()
	{
		URL url = null;
		WebAnalyzer obj = new WebAnalyzer();
		try
		{
			url = new URL("https://www.nasa.gov/multimedia/imagegallery/index.html");
		} catch (IOException e)
		{
			e.printStackTrace();
			assertTrue(false);
		}
		try {
			AnalyzeResult result = obj.analyzePage(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//assertEquals(new Integer(41), result);
		assertTrue(true);
	}*/
	
}
