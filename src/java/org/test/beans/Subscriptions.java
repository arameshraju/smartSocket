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
public class Subscriptions {
    String magzine;
    String validTill;

    public String getMagzine() {
        return magzine;
    }

    public void setMagzine(String magzine) {
        this.magzine = magzine;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    @Override
    public String toString() {
        return "Subscriptions{" + "magzine=" + magzine + ", validTill=" + validTill + '}';
    }
    
}
