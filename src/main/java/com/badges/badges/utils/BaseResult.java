package com.badges.badges.utils;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseResult<T> {
    /**
     * Status Code
     */
    private int code;

    /**
     * Message of response
     */
    private String msg;

    private T data;

    public BaseResult<T> success(T data) {
        this.code = 200;
        this.msg = "";
        this.data = data;
        return this;
    }


}
