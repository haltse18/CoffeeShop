/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halt.google;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;

/**
 *
 * @author Dell
 */
public class GoogleUtils {

    public static String getToken(final String code) throws ClientProtocolException, IOException {
        String response = Request.Post(Constants.GOOGLE_LINK_GET_TOKEN)
                .bodyForm(Form.form().add("client_id", Constants.GOOGLE_CLIENT_ID)
                        .add("client_secret", Constants.GOOGLE_CLIENT_SECRET)
                        .add("redirect_uri", Constants.GOOGLE_REDIRECT_URI).add("code", code)
                        //                        .add("given_name", Constants.GOOGLE_REDIRECT_URI).add("code", code)
                        .add("grant_type", Constants.GOOGLE_GRANT_TYPE).build())
                .execute().returnContent().asString();
        JsonObject jobj = new Gson().fromJson(response, JsonObject.class);
        String accessToken = jobj.get("access_token").toString().replaceAll("\"", "");
        return accessToken;
    }

    public static GoogleDTO getUserInfo(final String accessToken) throws ClientProtocolException, IOException {
        String link = Constants.GOOGLE_LINK_GET_USER_INFO + accessToken;
        System.out.println(link);
        String response = Request.Get(link).execute().returnContent().asString();
        System.out.println(response);
        GoogleDTO googlePojo = new Gson().fromJson(response, GoogleDTO.class);
        System.out.println(googlePojo.toString());

        URL url = new URL(link);
      URLConnection conn = url.openConnection();
      conn.setDoOutput(true);
      
      
      String line1 = "";
      BufferedReader reader = new BufferedReader(new InputStreamReader(
        conn.getInputStream()));
      String line;
      while ((line = reader.readLine()) != null)
      {
        line1 = line1 + line;
      }
        System.out.println("test:" + line1);

        return googlePojo;
    }

}
