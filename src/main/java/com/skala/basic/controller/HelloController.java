package com.skala.basic.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public Map<String, String> hello() {
    Map<String, String> response = new HashMap<>();
    response.put("message", "SKALA에 오신 것을 환영합니다.");
    return response;
  }
}
