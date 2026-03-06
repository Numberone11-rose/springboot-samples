package com.example.spingboothello.vo;

/**
 * 统一响应结果包装类
 * @param <T> 响应数据类型
 */
public class ResultVO<T> {
    // 响应码
    private Integer code;
    // 响应提示信息
    private String msg;
    // 响应数据
    private T data;

    // 无参构造
    public ResultVO() {}

    // 全参构造
    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // 快捷创建成功响应的静态方法
    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(200, "success", data);
    }

    // Getter & Setter
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
