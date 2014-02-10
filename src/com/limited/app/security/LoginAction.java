package com.limited.app.security;

import org.springframework.beans.factory.annotation.Autowired;

import com.limited.app.service.AssetService;

public class LoginAction {
    private String username;
    private String password;
    
    @Autowired
    private AssetService assetService;
    public String execute() {
    	if (assetService==null){
    		System.out.println("autowiring did not work");
    	}
        if (this.username.equals("admin")
                && this.password.equals("admin123")) {
            return "success";
        } else {
            return "error";
        }
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}