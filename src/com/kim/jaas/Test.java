package com.kim.jaas;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String username = "username";
			String password = "password";

			// �˴�ָ����ʹ�������ļ��ġ�Sample"��֤ģ�飬��Ӧ��ʵ����ΪSampleLoginModule
			LoginContext lc = new LoginContext("Sample",
					new SampleCallbackHandler(username, password));

			// ���е�¼�����������֤ʧ�ܻ��׳��쳣
			lc.login();
			System.out.println("ok");
		} catch (LoginException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}

}
