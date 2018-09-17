package cn.lawuser.model;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class AjaxResult implements Serializable {
    private Integer status = HttpStatus.OK.value();
    private String message = "操作成功";
    private Object obj;

    public AjaxResult() {
    }

    public AjaxResult(String message) {
        this.status = HttpStatus.OK.value();
        this.message = message;
    }

    public AjaxResult(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public AjaxResult(HttpStatus httpStatus, String message) {
        this.status = httpStatus.value();
        this.message = message;
    }

    public AjaxResult(Integer status, String message, Object obj) {
        this.status = status;
        this.message = message;
        this.obj = obj;
    }

    public AjaxResult(HttpStatus httpStatus, String message, Object obj) {
        this.status = httpStatus.value();
        this.message = message;
        this.obj = obj;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
