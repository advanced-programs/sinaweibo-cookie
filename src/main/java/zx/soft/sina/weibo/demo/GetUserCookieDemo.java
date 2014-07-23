package zx.soft.sina.weibo.demo;

import org.apache.http.client.ClientProtocolException;

import zx.soft.sina.weibo.cookie.GetUserCookie;
import zx.soft.sina.weibo.domain.LoginPojo;

public class GetUserCookieDemo {

	public static void main(String[] args) throws ClientProtocolException, Exception {
		// 对登陆微博的帐号、密码、uid的设置
		LoginPojo loginPojo = new LoginPojo();

		loginPojo.setUsername("username");
		loginPojo.setPassword("password");
		loginPojo.setUid("uid");

		// 非代理登陆
		GetUserCookie cookieUtil = new GetUserCookie(loginPojo);

		// 用代理登陆
		//		GetUserCookie cookieUtil = new GetUserCookie(loginPojo, proxyPojo);

		String cookieString = cookieUtil.getCookies("7.0");
		if (cookieString == null || cookieString.isEmpty()) {
			System.out.println("最終得到的cookies為空，請檢查!");
		} else {
			System.out.println("cookieString---" + cookieString);
		}
	}

}
