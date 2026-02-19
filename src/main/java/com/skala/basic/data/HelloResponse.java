package com.skala.basic.data;

import lombok.Data;

@Data
public class HelloResponse {

    // 성공:0, 실패:1
    int code;
    String message;
}
