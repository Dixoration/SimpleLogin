/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.example.simplelogin;

/**
 *
 * @author jengDizort
 */
public class LoginService {
    private static final String DUMMY_USER_NAME = "guest";
    private static final String DUMMY_PASSWORD = "password333";
    
    public boolean login(String userName,String password){
        boolean loginSuccessful = false;
        if(userName.equals(DUMMY_USER_NAME) && password.equals(DUMMY_PASSWORD)){
            loginSuccessful = true;
        }
        return loginSuccessful;
    }
}
