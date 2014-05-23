## Build & run

```
mvn package wildfly:run
```

## Test with browser

Point your browser to http://localhost:8080/wildfly-websocket

## Test with WebSpcket client

URL: http://localhost:8080/wildfly-websocket/bike

```
// ws is WebSocket instance
ws.send("blabla");
```

Server will return the string sent by the client but capitalized.