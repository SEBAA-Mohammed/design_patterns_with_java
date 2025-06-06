package com.mohammedsebaa.chain_of_responsibility.controller;

import com.mohammedsebaa.chain_of_responsibility.model.RequestData;
import com.mohammedsebaa.chain_of_responsibility.service.FilterChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RequestController {
    @Autowired
    private FilterChainService filterChainService;

    @PostMapping("/process")
    public ResponseEntity<RequestData> process(@RequestBody RequestData request) {
        filterChainService.process(request);
        return ResponseEntity.ok(request);
    }
}
