/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.beans;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 *
 * @author alluri
 */
public class JsonBeanTest {
    private static String userMasterJson="{\"userName\":\"Ramesh Raju Alluri\",\"email\":\"fake.email@gmail.com\",\"access\":\"user\"}";
    private static String userTransJson="{\"userName\":\"Ramesh Raju Alluri\",\"subscriptions\":[{\"magzine\":\"Digit\",\"validTill\":\"April-16\"},{\"magzine\":\"Open Source\",\"validTill\":\"April-18\"},{\"magzine\":\"PC Quest\",\"validTill\":\"April-17\"}],\"level\":\"userLeven\"}";
    private static String userTransJsonMore="{\"userName\":\"Ramesh Raju Alluri\",\"subscriptions\":[{\"magzine\":\"Digit\",\"validTill\":\"April-16\"},{\"magzine\":\"Open Source\",\"validTill\":\"April-18\"},{\"magzine\":\"PC Quest\",\"validTill\":\"April-17\"}],\"level\":\"userLeven\",\"upLevel\":\"userLeven\"}";
    public static void main(String[] arg) throws IOException{
        System.out.println("Application Started");
         ObjectMapper mapper = new ObjectMapper();
         mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
         UserMaster um=  mapper.readValue(userMasterJson, UserMaster.class);
         System.out.println(um);
         UserTrans ut=mapper.readValue(userTransJson, UserTrans.class );
           System.out.println(ut);
         UserTrans utn=mapper.readValue(userTransJsonMore, UserTrans.class );
           System.out.println(utn);
           System.out.println( mapper.writeValueAsString(ut));
     
    }
    
}
