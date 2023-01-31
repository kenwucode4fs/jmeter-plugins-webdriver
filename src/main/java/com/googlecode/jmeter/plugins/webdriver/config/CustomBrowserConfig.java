package com.googlecode.jmeter.plugins.webdriver.config;

public class CustomBrowserConfig {
    private String browserLanguage;
    private boolean headless;

    private CustomBrowserConfig(Builder builder){
        this.browserLanguage = builder.getBrowserLanguage();
        this.headless = builder.isHeadless();
    }

    public String getBrowserLanguage() {
        return browserLanguage;
    }

    public void setBrowserLanguage(String browserLanguage) {
        this.browserLanguage = browserLanguage;
    }

    public boolean isHeadless() {
        return headless;
    }

    public void setHeadless(boolean headless) {
        this.headless = headless;
    }

    public static class Builder {
        private String browserLanguage;
        private boolean headless;

        public Builder(){
        }

        public String getBrowserLanguage() {
            return browserLanguage;
        }

        public Builder setBrowserLanguage(String browserLanguage) {
            this.browserLanguage = browserLanguage;
            return this;
        }

        public boolean isHeadless() {
            return headless;
        }

        public Builder setHeadless(boolean headless) {
            this.headless = headless;
            return this;
        }

        public CustomBrowserConfig build(){
            return new CustomBrowserConfig(this);
        }
    }
}
