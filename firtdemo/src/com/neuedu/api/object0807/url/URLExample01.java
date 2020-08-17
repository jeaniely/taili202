package com.neuedu.api.object0807.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLExample01 {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://3c.tmall.com/?spm=875.7931836/B.2016004.4.171e4265yelU5L&acm=lb-zebra-148799-667861.1003.4.2429983&scm=1003.4.lb-zebra-148799-667861.OTHER_14561822298635_2429983");

        System.out.println("host:"+url.getHost());
        System.out.println("protocol:"+url.getProtocol());
        System.out.println("file:"+url.getFile());

        InputStream inputStream = url.openStream();
        InputStreamReader isr=new InputStreamReader(inputStream,"utf-8");
        BufferedReader br=new BufferedReader(isr);
        String str=br.readLine();
       while(str!=null){
           System.out.println(str);
           str=br.readLine();
       }

       br.close();
       isr.close();
       inputStream.close();

    }
}
