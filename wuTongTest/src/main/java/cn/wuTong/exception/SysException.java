package cn.wuTong.exception;

/**
 * @Author 赖国财
 * @Date 2020/9/8 17:07
 */
public class SysException extends Exception {

    //异常信息
    private String message;

    public SysException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
