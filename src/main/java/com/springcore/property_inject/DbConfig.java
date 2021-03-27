
package com.springcore.property_inject;

import java.util.Properties;

public class DbConfig {
    
    private Properties config;

    public Properties getConfig() {
        return config;
    }

    public void setConfig(Properties config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "DbConfig{" + "config=" + config + '}';
    }

   
    
}
