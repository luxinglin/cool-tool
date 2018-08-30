package cn.com.gary.cooltool.common.pojo;

/**
 * Created by ace on 2017/8/23.
 */
public abstract class BaseResult {
    private int code = 200;
    private boolean status = RestResult.Status.SUCCESS.getValue();
    private String message;

    public BaseResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResult() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
