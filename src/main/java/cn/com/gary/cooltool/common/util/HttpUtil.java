package cn.com.gary.cooltool.common.util;

import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.io.UnsupportedEncodingException;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-05-30 12:17
 **/
public class HttpUtil {
    private HttpUtil() {
    }

    /**
     * @param params
     * @return
     * @throws UnsupportedEncodingException
     */
    public static HttpEntity getHttpRequestEntity(Object params) throws UnsupportedEncodingException {
        MultiValueMap<String, Object> headers = new LinkedMultiValueMap<String, Object>();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json;charset=UTF-8");
        String requestBody = new String(JsonUtil.toJson(params).getBytes(), "utf-8");
        HttpEntity request = new HttpEntity(requestBody, headers);
        return request;
    }

}
