package com.example.demo.web;

import com.example.demo.domain.Message;
import com.example.demo.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/messages")
public class MessageController {

    MessageService messageService;

    Logger logger = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public ResponseEntity getAll() {
        List<Message> result = messageService.getAll();
        logger.info("Found all messages");
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Message getById(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
        return messageService.getById(uuid);
    }
}
