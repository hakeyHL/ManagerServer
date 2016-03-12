package cn.yunqitong.util;

import java.util.Random;

public class TokenGenerate {
	/**
	 * 生成制定长度验证码
	 * 
	 * @param verifyCode_len
	 *            验证码长度
	 * @return String
	 */
	public static String getRandmonVerifyCode(int len) {
		char[] c = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
				'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int maxNum = 25;
		int count = 0;// 记录验证码长度

		StringBuffer verifyCodeStr = new StringBuffer();
		Random random = new Random();
		while (count < len) {
			int i = random.nextInt(maxNum);
			if (i >= 0 && i < c.length) {
				verifyCodeStr.append(String.valueOf(c[i]));
				count++;
			}
		}
		return verifyCodeStr.toString();
	}
	public static void main(String[] args) {
		String randmonVerifyCode = getRandmonVerifyCode(25);
		System.out.println(randmonVerifyCode);
;	}
}
