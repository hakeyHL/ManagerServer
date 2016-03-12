package cn.yunqitong.security;

import org.springframework.security.core.AuthenticationException;

public class ValidateCodeException  extends AuthenticationException {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Constructs an <code>AuthenticationServiceException</code> with the
     * specified message.
     *
     * @param msg the detail message
     */
    public ValidateCodeException(String msg) {
        super(msg);
    }

    /**
     * Constructs an <code>AuthenticationServiceException</code> with the
     * specified message and root cause.
     *
     * @param msg the detail message
     * @param t root cause
     */
    public ValidateCodeException(String msg, Throwable t) {
        super(msg, t);
    }

}
