package com.winocencio.poc.chain.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChainController {

    @PostMapping("/chain")
    public ResponseEntity<?> insertUsingChain(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
