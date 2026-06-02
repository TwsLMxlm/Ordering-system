/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordersystem;

/**
 *
 * @author ThinkPad
 */
public class Customer {
    static String userName,password;
    static String orderTime;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setOrderTime(String orderTime){
        this.orderTime=orderTime;
    }
    public String getOrderTime(){
        return orderTime;
    }
}
