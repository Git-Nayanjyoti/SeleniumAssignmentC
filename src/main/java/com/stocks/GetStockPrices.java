package com.stocks;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class GetStockPrices extends Base {

	public static List<Object[]> finalData = new ArrayList<Object[]>();
	public static Object[] entities = new Object[10];

	public static void main(String[] args) throws InterruptedException, IOException {

		// for getting the data after every 10 minutes using a infinite loop with sleep
		while (true) {

			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Stock Prices");
			js = (JavascriptExecutor) driver;

			// Setting the browser and the url of the website here
			setBrowser("chrome", "https://www.moneycontrol.com/markets/indian-indices/");
			Thread.sleep(2000);

			// creating object of JavascriptExecutor to scroll down through the webpage
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");

			// Setting the header of the table
			finalData.add(
					new Object[] { 
							"Name",
							"LTP",
							"%Chg",
							"Volume",
							"Buy Price",
							"Sell Price",
							"Buy Qty",
							"Sell Qty"
						});

			// passing the xpath of the table body present in the website
			WebElement Table = driver.findElement(By.xpath(
					"/html/body/section/div/div/div/div[4]/div/div/div[1]/div/div[2]/div[3]/div[4]/div/div/div[1]/table/tbody"));

			// finding the elements of the table with tag tageName
			List<WebElement> TableRow = Table.findElements(By.tagName("tr"));

			// reading the text present in the table row wise
			for (WebElement tr : TableRow) {
				int i = 0;
				List<WebElement> TableData = tr.findElements(By.tagName("td"));
				for (WebElement td : TableData) {
					entities[i++] = td.getText();
				}
				finalData.add(new Object[] { 
						entities[0],
						entities[1],
						entities[2],
						entities[3],
						entities[4],
						entities[5],
						entities[6],
						entities[7]
					});

			}

			int rowNum = 0;
			for (Object[] stockdata : finalData) {
				Row row = sheet.createRow(rowNum++);
				int colNum = 0;
				for (Object data : stockdata) {
					Cell cell = row.createCell(colNum++);
					if (data instanceof String) {
						cell.setCellValue((String) data);
					} else if (data instanceof Integer) {
						cell.setCellValue((Integer) data);
					}
				}

			}

			// writing the generated data to file -> data.xlsx
			FileOutputStream ois = new FileOutputStream("data.xlsx");
			workbook.write(ois);
			workbook.close();

			System.out.println("The stock price for various stocks are add to the data.xlsx file successfully");
			System.out.println("The next update starts in 10 minutes...");

			// for making the program to start again after 10 mins
			TimeUnit.MINUTES.sleep(10);
			finalData = null;

		}

	}

}
