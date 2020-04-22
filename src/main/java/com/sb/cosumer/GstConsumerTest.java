package com.sb.cosumer;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class GstConsumerTest {
	public static void main(String[] args) {
		try {
			String URI="http://localhost:8080/jerseyProducerAppMultiController";
			String PATH="satya/gst";
			Client c=ClientBuilder.newClient();
			WebTarget wt=c.target(URI).path(PATH);
			wt=wt.queryParam("base",20000);
			wt=wt.queryParam("gstp",9);
		    Invocation.Builder builder =wt.request();
		    Response res=builder.get();
		    System.out.println(res.getStatus());
		    System.out.println(res.getStatusInfo());
		    System.out.println(res.readEntity(String.class));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
