package net.blancodev.pickem4me;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Class I wrote a while ago and re-use/tweak in all of my projects
 * Easily builds HTTP(S) requests and responses
 */
public class ConnectionBuilder {

    private final static String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36";

    private String endpoint;
    private int port;

    private String data;
    private ConnectionMethod method;

    private Proxy proxy;

    private boolean https;

    private int timeout;

    private Map<String, String> headers;

    private HttpURLConnection finalConnection;

    private boolean minimize;

    private static final Map<String, URL> urlCache = new ConcurrentHashMap<>();

    public boolean failed;

    public ConnectionBuilder(String endpoint) {

        this.endpoint = endpoint;
        this.port = 80;
        this.data = new String();
        this.timeout = 45_000;
        this.headers = new HashMap<>();
        this.method = ConnectionMethod.GET;
        this.https = false;
        this.minimize = false;

        urlCache.computeIfAbsent(endpoint, k -> {
            try {
                return new URL(endpoint);
            } catch (MalformedURLException e) { }
            return null;
        });
    }

    public ConnectionBuilder https(boolean https) {
        this.https = https;
        return this;
    }

    public ConnectionBuilder proxy(Proxy proxy) {
        this.proxy = proxy;
        return this;
    }

    public ConnectionBuilder minimize(boolean minimize) {
        this.minimize = minimize;
        return this;
    }

    public ConnectionBuilder endpoint(String endpoint) {

        this.endpoint = endpoint;

        return this;

    }

    public ConnectionBuilder header(String key, String value) {
        this.headers.put(key, value);

        return this;
    }

    public ConnectionBuilder port(int port) {

        this.port = port;

        return this;

    }

    public ConnectionBuilder method(ConnectionMethod method) {

        this.method = method;

        return this;

    }

    public ConnectionBuilder data(String data) {

        this.data = data;

        return this;

    }

    public ConnectionBuilder timeout(int timeout) {

        this.timeout = timeout;

        return this;

    }

    public ConnectionBuilder send() {

        try {

            if (method == ConnectionMethod.POST) {

                HttpURLConnection connection;
                if (https) {
                    if (proxy != null) {
                        connection = (HttpsURLConnection) urlCache.get(endpoint).openConnection(proxy);
                    } else {
                        connection = (HttpsURLConnection) urlCache.get(endpoint).openConnection();
                    }
                } else {
                    if (proxy != null) {
                        connection = (HttpURLConnection) urlCache.get(endpoint).openConnection(proxy);
                    } else {
                        connection = (HttpURLConnection) urlCache.get(endpoint).openConnection();
                    }
                }

                connection.setConnectTimeout(timeout);
                connection.setReadTimeout(timeout);
                connection.setDoInput(true);
                connection.setDoOutput(true);

                connection.setRequestMethod("POST");
                if (!minimize) {
                    connection.setRequestProperty("User-Agent", USER_AGENT);
                }

                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    connection.setRequestProperty(entry.getKey(), entry.getValue());
                }

                if (minimize) {
                    connection.setRequestProperty("accept", "*/*");
                    connection.setRequestProperty("user-agent", "a");
                }

                DataOutputStream output = new DataOutputStream(connection.getOutputStream());
                output.writeBytes(data);
                output.flush();
                output.close();

                finalConnection = connection;

            } else if (method == ConnectionMethod.PUT) {

                HttpURLConnection connection;
                if (https) {
                    if (proxy != null) {
                        connection = (HttpsURLConnection) urlCache.get(endpoint).openConnection(proxy);
                    } else {
                        connection = (HttpsURLConnection) urlCache.get(endpoint).openConnection();
                    }
                } else {
                    if (proxy != null) {
                        connection = (HttpURLConnection) urlCache.get(endpoint).openConnection(proxy);
                    } else {
                        connection = (HttpURLConnection) urlCache.get(endpoint).openConnection();
                    }
                }

                connection.setConnectTimeout(timeout);
                connection.setReadTimeout(timeout);
                connection.setDoInput(true);
                connection.setDoOutput(true);

                connection.setRequestMethod("PUT");
                if (!minimize) {
                    connection.setRequestProperty("User-Agent", USER_AGENT);
                }

                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    connection.setRequestProperty(entry.getKey(), entry.getValue());
                }

                if (minimize) {
                    connection.setRequestProperty("accept", "*/*");
                    connection.setRequestProperty("user-agent", "a");
                }

                DataOutputStream output = new DataOutputStream(connection.getOutputStream());
                output.writeBytes(data);
                output.flush();
                output.close();

                finalConnection = connection;

            } else if (method == ConnectionMethod.GET) {

                HttpURLConnection connection;
                if (https) {
                    if (proxy != null) {
                        connection = (HttpsURLConnection) urlCache.get(endpoint).openConnection(proxy);
                    } else {
                        connection = (HttpsURLConnection) urlCache.get(endpoint).openConnection();
                    }
                } else {
                    if (proxy != null) {
                        connection = (HttpURLConnection) urlCache.get(endpoint).openConnection(proxy);
                    } else {
                        connection = (HttpURLConnection) urlCache.get(endpoint).openConnection();
                    }
                }

                if (!minimize) {
                    connection.setRequestProperty("User-Agent", USER_AGENT);
                }

                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    connection.setRequestProperty(entry.getKey(), entry.getValue());
                }

                if (minimize) {
                    connection.setRequestProperty("accept", "*/*");
                    connection.setRequestProperty("user-agent", "a");
                }

                connection.setConnectTimeout(timeout);
                connection.setReadTimeout(timeout);
                connection.setDoOutput(true);

                finalConnection = connection;

            }


        } catch (Exception e) {
            failed = true;
        }

        return this;

    }

    public String getCookiesStr() {

        if (finalConnection != null) {

            StringBuilder cookies = new StringBuilder();

            for (Map.Entry<String, List<String>> entry : finalConnection.getHeaderFields().entrySet()) {

                if (entry.getKey() != null && entry.getKey().equalsIgnoreCase("set-cookie")) {

                    for (String cookie : entry.getValue()) {

                        cookies.append(cookie).append(cookie.endsWith(";") ? "" : ";");

                    }

                }

            }

            return cookies.toString();

        }

        return "";

    }

    public Map<String, String> getCookies() {

        String cookiesStr = getCookiesStr();

        if (cookiesStr.replace(" ", "").length() == 0) {
            return new HashMap<>();
        }


        Map<String, String> cookies = new HashMap<>();

        String[] split = cookiesStr.split(";");

        for (String cookie : split) {
            String[] cookieSplit = cookie.split("=");
            if (cookieSplit.length == 2) {
                cookies.put(cookieSplit[0], cookieSplit[1]);
            }
        }

        return cookies;

    }

    public String getResponse() {

        if (finalConnection != null) {

            try {
                if (finalConnection.getResponseCode() > 199 && finalConnection.getResponseCode() < 400) {

                    BufferedReader reader = new BufferedReader(new InputStreamReader(finalConnection.getInputStream()));

                    StringBuilder finalRes = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        finalRes.append(line);
                    }

                    reader.close();

                    return finalRes.toString();

                } else {

                    BufferedReader reader;
                    try {
                        reader = new BufferedReader(new InputStreamReader(finalConnection.getErrorStream()));
                    } catch (NullPointerException x) {
                        failed = true;
                        return "Error grabbing response 1";
                    }

                    StringBuilder finalRes = new StringBuilder();
                    String line;

                    try {
                        while ((line = reader.readLine()) != null) {
                            finalRes.append(line);
                        }
                    } catch (IOException e1) {
                        return "Error grabbing response 2";
                    }

                    try {
                        reader.close();
                    } catch (IOException e1) {
                        failed = true;
                        return "Error grabbing response 3";
                    }

                    return finalRes.toString();

                }
            } catch (IOException e) {
                failed = true;
                return "Error grabbing response 4";
            }

        } else {
            failed = true;
            return "Error grabbing response 5";
        }

    }

    public String getHeader(String name) {

        return finalConnection.getHeaderField(name);

    }

    public int getResponseCode() {
        try {
            return finalConnection.getResponseCode();
        } catch (Exception e) {
            return 400;
        }
    }

    public HttpURLConnection getFinalConnection() {
        return finalConnection;
    }

    public Map<String, String> getSentHeaders() {
        return headers;
    }

    private String formatGetURL(String url, String data) {

        String newURL = url;

        if (!newURL.endsWith("?")) {
            newURL = newURL + "?";
        }

        newURL = newURL + data;

        return newURL;

    }

    public static String getUserAgent() {
        return USER_AGENT;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public int getPort() {
        return port;
    }

    public String getData() {
        return data;
    }

    public ConnectionMethod getMethod() {
        return method;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public boolean isHttps() {
        return https;
    }

    public int getTimeout() {
        return timeout;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public static Map<String, URL> getUrlCache() {
        return urlCache;
    }

    public boolean isFailed() {
        return failed;
    }

    public enum ConnectionMethod {

        POST, GET, PUT;

    }

}