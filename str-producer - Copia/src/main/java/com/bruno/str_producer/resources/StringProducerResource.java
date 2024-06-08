package com.bruno.str_producer.resources;

import com.bruno.str_producer.services.StringProducerService;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/producer")
public class StringProducerResource {

    private final StringProducerService producerService;

    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestBody String message) {
        producerService.sendMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
