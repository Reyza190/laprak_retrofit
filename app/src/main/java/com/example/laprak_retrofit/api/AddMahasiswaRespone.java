package com.example.laprak_retrofit.api;

import com.google.gson.annotations.SerializedName;

public class AddMahasiswaRespone {

    @SerializedName("message")
    private String message;

    @SerializedName("status")
    private boolean status;

    public String getMessage() {
        return message;
    }

    public boolean isStatus() {
        return status;
    }
}
