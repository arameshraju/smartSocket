/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.smartStocket.server;

import java.io.IOException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author alluri
 */
@ServerEndpoint("/smartServer")
public class SmartServer {
    
    @OnOpen
        public void open(Session session) throws IOException {
            System.out.println("Opend");
            session.getBasicRemote().sendText("Socket Opend");
            
    }

    @OnClose
        public void close(Session session) {
                        System.out.println("Closed");
    }

    @OnError
        public void onError(Throwable error) {
            System.out.println("Errored");
    }

    @OnMessage
        public void handleMessage(String message, Session session) {
            System.out.println("Message + " + message );
    }
}
