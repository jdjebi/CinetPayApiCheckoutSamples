package com.payin;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class InitPayment {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		final String API_KEY = "12912847765bc0db748fdd44.40081707"; 
		
		final String SITE_ID = "445160";
		
		final String URL = "https://new-api.cinetpay.ci/v2/payment";
		
		String payment = String.format("{\r\n"
				+ "        \"amount\": \"100\",\r\n"
				+ "        \"apikey\":  \"%s\",\r\n"
				+ "        \"site_id\": \"%s\",\r\n"
				+ "        \"currency\": \"XOF\",\r\n"
				+ "        \"transaction_id\": \"id-de-paiement-unique\",\r\n"
				+ "        \"description\": \"TRANSACTION DESCRIPTION\",\r\n"
				+ "        \"return_url\": \"https://www.exemple.com/return\",\r\n"
				+ "        \"notify_url\": \"https://www.exemple.com/notify\",\r\n"
				+ "        \"customer_name\": \"Dje Bi\",\r\n"
				+ "        \"customer_surname\": \"Jean-Marc\"\r\n"
				+ "        \r\n"
				+ "    }",API_KEY,SITE_ID);
				
		BodyPublisher requestBody = HttpRequest.BodyPublishers.ofString(payment);
		
		try {
			
			HttpRequest request = HttpRequest.newBuilder()
					.uri(new URI(URL))
					.header("Content-Type","application/json")
					.POST(requestBody)
					.build();
			
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, BodyHandlers.ofString());
			
			System.out.println(response.body());
			
		} catch (URISyntaxException e) {

			e.printStackTrace();
			
		}

				
	}
}
