package com.coachhe.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 404 NOT FOUNT
    private Integer code;   //404
    private String message; //NOT FOUND
    private T data;         //通用返回类型，如果是Payment就返回一个Payment

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
