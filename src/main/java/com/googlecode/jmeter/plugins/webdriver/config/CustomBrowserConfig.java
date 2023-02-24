package com.googlecode.jmeter.plugins.webdriver.config;

public class CustomBrowserConfig {
    private String browserLanguage;
    private boolean acceptInSecureCert = true;

    private CustomBrowserConfig(Builder builder) {
        this.browserLanguage = builder.getBrowserLanguage();
        this.acceptInSecureCert = builder.acceptInSecureCert();
    }

    public String getBrowserLanguage() {
        return browserLanguage;
    }

    public void setBrowserLanguage(String browserLanguage) {
        this.browserLanguage = browserLanguage;
    }

    public boolean isAcceptInSecureCert() {
        return acceptInSecureCert;
    }

    public void setAcceptInSecureCert(boolean acceptInSecureCert) {
        this.acceptInSecureCert = acceptInSecureCert;
    }

    public static class Builder {
        private String browserLanguage;
        private boolean acceptInSecureCert = true;

        public Builder() {
        }

        public String getBrowserLanguage() {
            return browserLanguage;
        }

        public Builder setBrowserLanguage(String browserLanguage) {
            this.browserLanguage = browserLanguage;
            return this;
        }

        public Builder setAcceptInSecureCery(boolean acceptInSecureCert) {
            this.acceptInSecureCert = acceptInSecureCert;
            return this;
        }

        public CustomBrowserConfig build() {
            return new CustomBrowserConfig(this);
        }

        public boolean acceptInSecureCert() {
            return this.acceptInSecureCert;
        }
    }
}
