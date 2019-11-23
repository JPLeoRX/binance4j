package com.tekleo.binance4j.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class SimpleHttpClient {
    private static String execute(HttpClient httpClient, HttpUriRequest request) throws SimpleHttpClientException {
        HttpResponse httpResponse = null;

        // Try to execute, and re-throw exception if it occurs
        try {
            httpResponse = httpClient.execute(request);
        } catch (Exception e) {
            throw new SimpleHttpClientException("Failed to execute request: ", e);
        }

        // If response was successful
        if (httpResponse.getStatusLine().getStatusCode() == 200) {
            try {
                return EntityUtils.toString(httpResponse.getEntity());
            } catch (Exception e) {
                throw new SimpleHttpClientException("Can't read response: ", e);
            }
        }

        // If invalid code - throw exception
        else {
            throw new SimpleHttpClientException("Http response status code is invalid: " + httpResponse.getStatusLine().getStatusCode());
        }
    }

    public static String doGet(String url) throws SimpleHttpClientException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Accept", "application/json");

        String response = null;

        try {
            response = execute(httpClient, httpGet);
        } catch (Exception e) {
            throw new SimpleHttpClientException(url, e);
        } finally {
            HttpClientUtils.closeQuietly(httpClient);
        }

        return response;
    }

    public static String doPost(String url, String jsonPayload) throws SimpleHttpClientException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(new StringEntity(jsonPayload, ContentType.APPLICATION_JSON));
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");

        String response = null;

        try {
            response = execute(httpClient, httpPost);
        } catch (Exception e) {
            throw new SimpleHttpClientException(url, e);
        } finally {
            HttpClientUtils.closeQuietly(httpClient);
        }

        return response;
    }
}
