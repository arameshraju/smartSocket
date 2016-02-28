/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.beans;

/**
 *
 * @author alluri
 */
public class UserTrans {
    String userName;
    Subscriptions[] subscriptions;
    String level;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Subscriptions[] getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Subscriptions[] subscriptions) {
        this.subscriptions = subscriptions;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "UserTrans{" + "userName=" + userName + ", subscriptions=" + subscriptions + ", level=" + level + '}';
    }
    
}
