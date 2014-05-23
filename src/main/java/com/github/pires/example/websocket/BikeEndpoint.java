package com.github.pires.example.websocket;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ServerEndpoint("/bike")
public class BikeEndpoint {

  private static final Logger log = LoggerFactory.getLogger(BikeEndpoint.class);

  @OnMessage
  public void shout(String cmd, Session client) {
    log.info("Received {} from {}", cmd, client);
    client.getAsyncRemote().sendText(cmd.toUpperCase());
  }

}
