package cn.yunqitong.util;

/**
 * 用于
 * 
 * @author Administrator
 * 
 */
public class SignUtil {
	public static String getSign(String data, String privateKeyPath)
			throws Exception {
		byte[] sign = null;
		sign = RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt
				.loadPrivateKeyByFile(privateKeyPath)), data.getBytes());
		String cipher = Base64.encode(sign);
		return cipher;
	}
}
