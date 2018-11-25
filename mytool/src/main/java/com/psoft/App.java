package com.psoft;

import java.net.*;
import java.io.*;

public class App {



    private static final String fName = "https://api.coindesk.com/v1/bpi/currentprice.json";

    public static void main(String[] args)  {

        try {

                    StringBuilder parsedContentFromUrl = new StringBuilder();
            URL sURL = new URL(fName);
            URLConnection myURLCon = sURL.openConnection();
                     myURLCon.connect();
                       BufferedInputStream in = new BufferedInputStream(myURLCon.getInputStream());

            int ch;
            while ((ch = in.read()) != -1) {
                parsedContentFromUrl.append((char) ch);

            }
            System.out.println("Full Source JSON string:");
            System.out.println(parsedContentFromUrl);

            in.close();
        }
        catch (MalformedURLException e) {
                       System.out.println("--MalformedURLException");
        }
        catch (IOException e) {
                       e.printStackTrace();
            System.out.println("--IOException");
        }

    }
}