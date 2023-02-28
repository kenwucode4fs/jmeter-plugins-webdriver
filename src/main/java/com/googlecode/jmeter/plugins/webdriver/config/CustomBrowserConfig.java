package com.googlecode.jmeter.plugins.webdriver.config;

public class CustomBrowserConfig {
    private String browserLanguage;

    private CustomBrowserConfig(Builder builder) {
        this.browserLanguage = builder.getBrowserLanguage();
    }

    public String getBrowserLanguage() {
        return browserLanguage;
    }

    public void setBrowserLanguage(String browserLanguage) {
        this.browserLanguage = browserLanguage;
    }

    public static class Builder {
        private String browserLanguage;

        public Builder() {
        }

        public String getBrowserLanguage() {
            return browserLanguage;
        }

        public Builder setBrowserLanguage(String browserLanguage) {
            this.browserLanguage = browserLanguage;
            return this;
        }

        public CustomBrowserConfig build() {
            return new CustomBrowserConfig(this);
        }

    }
}
