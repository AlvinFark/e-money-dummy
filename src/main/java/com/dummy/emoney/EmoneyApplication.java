package com.dummy.emoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class EmoneyApplication {

  public static void main(String[] args) {
    SpringApplication.run(EmoneyApplication.class, args);
  }

}
