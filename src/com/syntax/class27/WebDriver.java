package com.syntax.class27;


public interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();

    static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.openBrowser();
        chromeDriver.closeBrowser();
        chromeDriver.maximizeWindow();
        chromeDriver.findElement();
        FirefoxDriver chromeDriver1 = new FirefoxDriver();
        chromeDriver1.openBrowser();
        chromeDriver1.closeBrowser();
        chromeDriver1.maximizeWindow();
        chromeDriver1.findElement();


    }
}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Hi");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Hi");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Hi");
    }

    @Override
    public void findElement() {
        System.out.println("Hi");
    }
}

class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Hi");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Hi");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Hi");
    }

    @Override
    public void findElement() {
        System.out.println("Hi");
    }
}