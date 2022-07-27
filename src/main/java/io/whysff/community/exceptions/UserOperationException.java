package io.whysff.community.exceptions;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/07/12
 */
public class UserOperationException extends RuntimeException{

    static final long serialVersionUID = 261558922156939L;
    public UserOperationException(String msg) {
        super(msg);
    }

}
