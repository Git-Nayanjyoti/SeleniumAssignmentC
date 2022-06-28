
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white) 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Apache](https://img.shields.io/badge/apache-%23D42029.svg?style=for-the-badge&logo=apache&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Selenium](https://img.shields.io/badge/-selenium-%43B02A?style=for-the-badge&logo=selenium&logoColor=white)

![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

## Stock Price Fetcher
Stock Price Fetcher is an application which captures Name, LTP, %Chg, Volume, Buy Price, Sell Price, Buy Qty, Sell Qty of various stock from a financial website and stores it in an excel file.
This repository will give you an idea of how we can capture data from a website using selenium and then store the same into an excel file.

## Selenium
Selenium is an open-source tool that automates web browsers. It provides a single interface that lets you write test scripts in programming languages like Ruby, Java, NodeJS, PHP, Perl, Python, and C#, among others.

## Apache POI
The Apache POI Project's mission is to create and maintain Java APIs for manipulating various file formats based upon the Office Open XML standards (OOXML) and Microsoft's OLE 2 Compound Document format (OLE2). In short, you can read and write MS Excel files using Java. In addition, you can read and write MS Word and MS PowerPoint files using Java. Apache POI is your Java Excel solution (for Excel 97-2008). We have a complete API for porting other OOXML and OLE2 formats and welcome others to participate.

## WebDriver Manager
WebDriverManager is an open-source Java library that carries out the management (i.e., download, setup, and maintenance) of the drivers required by Selenium WebDriver (e.g., chromedriver, geckodriver, msedgedriver, etc.) in a fully automated manner. In addition, as of version 5, WebDriverManager provides other relevant features, such as the capability to discover browsers installed in the local system, building WebDriver objects (such as ChromeDriver, FirefoxDriver, EdgeDriver, etc.), running browsers in Docker containers seamlessly, and monitoring capabilities.
GitHub Link [visit](https://github.com/bonigarcia/webdrivermanager)

## Documentations
Apache POI documentation [visit](https://poi.apache.org/) <br>
Selenium documentation [visit](https://www.selenium.dev/documentation/) <br>
WebDriver Manager [visit](https://bonigarcia.dev/webdrivermanager/)



## Dependencies Used:
* Selenium 
```yaml
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>

```

* Apache POI
```yaml
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.2</version>
</dependency>

```

* WebDriver
```yaml
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.0.3</version>
</dependency>

```


## How to install the utility to your system
* clone the git repo to your workspace. Use this code -
  ` git clone https://github.com/Git-Nayanjyoti/SeleniumAssignmentC.git `
* Now Import the file to eclipse. (Import -> General -> Already existing project to eclipse -> browse the dir -> Finish)
* Set the POM file with the dependencies above. (The dependencies will be presennt there if the repo is cloned. Just open the POM file and then save it to install the dependencies)
* Add the all the libraries to your Project file. (Right click -> Build path -> Add External Archives -> Select jar Source and Apply)




## Author
- [@Nayanjyoti Rabha](https://www.github.com/Git-Nayanjyoti)

