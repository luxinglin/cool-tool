package cn.com.gary.cooltool.common.pojo;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-05-17 19:25
 **/
public class SelectOption<T> {
    private String label;
    private String value;
    private T data;

    public SelectOption() {
    }

    public SelectOption(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public SelectOption(String label, String value, T data) {
        this.label = label;
        this.value = value;
        this.data = data;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
