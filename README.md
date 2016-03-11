# Java клиент за Regix

Тази библиотека има за цел да представя пълната функционалност за извършване на справки през RegiX.

Примерно използване:

```
// Load the keystore that contains the identification certificate
FileInputStream keyStoreStream = new FileInputStream(keyStorePath);
RegixClient client = RegixClient.create(keyStoreSteram, keystorePassword);

ServiceRequestData requestData = 
    RegixClient.createRequestData(GraoOperation.PERMANENT_ADDRESS_SEARCH, personDataRequest);
        
CallContext ctx = new CallContext();
ctx.setAdministrationName("Министерски съвет");
ctx.setEmployeeIdentifier("12345");

requestData.setCallContext(ctx);
        
client.executeSynchronous(requestData);
```

Заб.: Препоръчително е да се използват <a href="http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html">Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files</a>