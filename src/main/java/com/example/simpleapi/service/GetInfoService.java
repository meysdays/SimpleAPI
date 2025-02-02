package com.example.simpleapi.service;

import com.example.simpleapi.entity.Response;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class GetInfoService {
    public Response stageInfo() {

        String currentTime = Instant.now().toString();

        return new Response("igbokwevictor122@gmail.com", currentTime, "https://github.com/meysdays/SimpleAPI");
    }
}
