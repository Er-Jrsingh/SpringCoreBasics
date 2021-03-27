package com.springcore.property;

import java.util.Properties;

public class DbConfiguration {
    
    private String vendor;
    private Properties config;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Properties getConfig() {
        return config;
    }

    public void setConfig(Properties config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "DbConfiguration{" + "vendor=" + vendor + ", config=" + config + '}';
    }

   

}
