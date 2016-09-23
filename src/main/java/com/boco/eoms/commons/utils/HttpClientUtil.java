package com.boco.eoms.commons.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class HttpClientUtil {
	private static final Logger LOG = LogManager.getLogger(HttpClientUtil.class);
	
	/**
	 * 模拟登陆
	 * @param url
	 * @param parameters
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static CloseableHttpClient login(String url, String parameters) throws ClientProtocolException, IOException{
		CloseableHttpClient httpClient = null;
		HttpClientContext context = null;
		CookieStore cookieStore = null;
		RequestConfig requestConfig = null;

		context = HttpClientContext.create();
		cookieStore = new BasicCookieStore();
		// 配置超时时间（连接服务端超时1秒，请求数据返回超时2秒）
		requestConfig = RequestConfig.custom().setConnectTimeout(120000).setSocketTimeout(60000)
				.setConnectionRequestTimeout(60000).build();
		// 设置默认跳转以及存储cookie
		httpClient = HttpClientBuilder.create().setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy())
				.setRedirectStrategy(new DefaultRedirectStrategy()).setDefaultRequestConfig(requestConfig)
				.setDefaultCookieStore(cookieStore).build();

		HttpPost httpPost = new HttpPost(url);
		List<NameValuePair> nvps = toNameValuePairList(parameters);
		httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
		CloseableHttpResponse response = httpClient.execute(httpPost, context);
		
		response.close();
		return httpClient;
	}
	/**
	 * 请求外部系统，
	 * @param url
	 * @param parameters
	 * @param httpClient  会话的HttpClient
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static CloseableHttpResponse post(String url, String parameters)
			throws ClientProtocolException, IOException {
		
		CloseableHttpClient httpClient = null;
		HttpClientContext context = null;
		CookieStore cookieStore = null;
		RequestConfig requestConfig = null;

		context = HttpClientContext.create();
		cookieStore = new BasicCookieStore();
		// 配置超时时间（连接服务端超时1秒，请求数据返回超时2秒）
		requestConfig = RequestConfig.custom().setConnectTimeout(120000).setSocketTimeout(60000)
				.setConnectionRequestTimeout(60000).build();
		// 设置默认跳转以及存储cookie
		httpClient = HttpClientBuilder.create().setKeepAliveStrategy(new DefaultConnectionKeepAliveStrategy())
				.setRedirectStrategy(new DefaultRedirectStrategy()).setDefaultRequestConfig(requestConfig)
				.setDefaultCookieStore(cookieStore).build();
		
		
		HttpPost httpPost = new HttpPost(url);
		List<NameValuePair> nvps = toNameValuePairList(parameters);
		httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
		CloseableHttpResponse response = httpClient.execute(httpPost,context);
		
		response.close();
		
		return response;
	}
	/**
	 * 把结果console出来
	 * 
	 * @param httpResponse
	 * @throws ParseException
	 * @throws IOException
	 */
	public static void printResponse(HttpResponse httpResponse) throws ParseException, IOException {
		// 获取响应消息实体
		HttpEntity entity = httpResponse.getEntity();
		// 响应状态
		System.out.println("status:" + httpResponse.getStatusLine());
		System.out.println("headers:");
		HeaderIterator iterator = httpResponse.headerIterator();
		while (iterator.hasNext()) {
			System.out.println("\t" + iterator.next());
		}
		// 判断响应实体是否为空
		if (entity != null) {
			String responseString = EntityUtils.toString(entity);
			System.out.println("response length:" + responseString.length());
			System.out.println("response content:" + responseString.replace("\r\n", ""));
		}
		System.out.println(
				"------------------------------------------------------------------------------------------\r\n");
	}
	@SuppressWarnings("unused")
	private static List<NameValuePair> toNameValuePairList(String parameters) {
		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		String[] paramList = parameters.split("&");
		for (String parm : paramList) {
			int index = -1;
			for (int i = 0; i < parm.length(); i++) {
				index = parm.indexOf("=");
				break;
			}
			String key = parm.substring(0, index);
			String value = parm.substring(++index, parm.length());
			nvps.add(new BasicNameValuePair(key, value));
		}
		System.out.println(nvps.toString());
		return nvps;
	}
}
