package com.llh.utils.net;

import java.util.HashMap;
import java.util.Map;

/**
 *   
 *  @ProjectName: Utils
 *  @Description: 
 *  @author yunjiu.llh
 *  @date 16/12/14
 */
public class URLUtils {
    public static Map<String,String> getParams(String url)
    {
        String paramStr = url.substring(url.indexOf("?")+1,url.length());
        Map<String, String> params = new HashMap<>();
        String []pairs = paramStr.split("&");
        for (String pair : pairs) {
            String []p = pair.split("=");
            if (p.length==2)
            {
                params.put(p[0],p[1]);
            }
        }
        return params;
    }
}
