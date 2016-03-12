package cn.yunqitong.exception;
import cn.yunqitong.util.CipherUtil;

public class Tdee {
	public static void main(String[] args) {
		String encryptWithSHA256 = CipherUtil.encryptWithSHA256("111111");
		System.out.println(encryptWithSHA256);
	}
}
