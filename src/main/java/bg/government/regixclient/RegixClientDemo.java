package bg.government.regixclient;

import java.lang.reflect.Field;

import bg.government.regixclient.requests.grao.GraoOperation;
import bg.government.regixclient.requests.grao.pna.PermanentAddressRequest;

public class RegixClientDemo {

    public static void main(String[] args) throws Exception {
        
        String keystorePassword = args[0];
        
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        
        PermanentAddressRequest personDataRequest = new PermanentAddressRequest();
        personDataRequest.setEGN("test");
        
        RegixClient client = RegixClient.create(RegixClientDemo.class.getResourceAsStream("/test.jks"), keystorePassword.toCharArray());
        ServiceRequestData requestData = RegixClient.createRequestData(GraoOperation.PERMANENT_ADDRESS_SEARCH, personDataRequest);
        
        CallContext ctx = new CallContext();
        requestData.setCallContext(ctx);
        
        System.out.println(client.executeSynchronous(requestData).getData().getResponse().getAny());
    }

    @SuppressWarnings("unused")
    private static void setupTLS() throws Exception {
        // enable strong security
        Field field = Class.forName("javax.crypto.JceSecurity").getDeclaredField("isRestricted");
        field.setAccessible(true);
        field.set(null, java.lang.Boolean.FALSE);
    }
}
