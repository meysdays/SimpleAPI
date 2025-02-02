package com.example.simpleapi.controller;

import com.example.simpleapi.entity.Response;
import com.example.simpleapi.service.GetInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
public class GetInfoController {

    @Autowired
    GetInfoService getInfoService;

//    @GetMapping("/hello")
//    public String show(){
//        return "hello world!";
//    }

    @GetMapping("/")
    public ResponseEntity<Response> getInfo(){
        Response response = getInfoService.stageInfo();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
