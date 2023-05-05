package com.pfcti.sanity.healthy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CheckApplicationHealthy {
    private String applicationName;
    private String messageStatus;


    public CheckApplicationHealthy () {
        this.applicationName = "Sanity Checker";
        this.messageStatus = "Healthy";
    }

    public String health () {
        return "The application " + this.applicationName + " is running " + this.messageStatus;
    }
}
