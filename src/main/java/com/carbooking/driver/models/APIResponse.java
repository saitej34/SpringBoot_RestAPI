package com.carbooking.driver.models;

import java.util.List;

public class APIResponse {

    private String statusMessage;
    private String infoMessage;


    public APIResponse(){


    }

    public APIResponse(String statusMessage, String infoMessage) {
        this.statusMessage = statusMessage;
        this.infoMessage = infoMessage;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getInfoMessage() {
        return infoMessage;
    }

    public void setInfoMessage(String infoMessage) {
        this.infoMessage = infoMessage;
    }
}
