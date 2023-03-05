package com.badges.badges.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResult<T> {
    /**
     * Status Code
     */
    private Integer code;

    /**
     * Message of response
     */
    private String msg;

    /**
     * Response data
     */
    private T data;

    public static <T> BaseResult<T> success(T data) {
        return new BaseResult<>(HttpStatus.OK.value(), "", data);
    }

    public static <T> BaseResult<T> error(String msg) {
        return new BaseResult<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg, null);
    }


}
