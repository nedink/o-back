package com.example.demo.service;

import com.example.demo.domain.Message;
import com.example.demo.domain.Person;
import com.example.demo.repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MessageService {

    public static final int PAGE_SIZE = 10;

    MessageRepository messageRepository;

    PersonService personService;

    Logger logger = LoggerFactory.getLogger(MessageService.class);

    @Autowired
    public MessageService(MessageRepository messageRepository, PersonService personService) {
        this.messageRepository = messageRepository;
        this.personService = personService;
    }

    public Page<Message> getRecentBySenderId(int quantity, UUID id) {
        Person sender = personService.getById(id);
        PageRequest pageRequest = PageRequest.of(quantity / PAGE_SIZE, quantity % PAGE_SIZE);
        logger.info("Retrieved recent {} by sender {}", quantity, id);
        return messageRepository.findAllBySenderOrderByDateDesc(sender, pageRequest);
    }

    public Message create(Message message) {
        return messageRepository.save(message);
    }

    public void deleteById(UUID id) {
        messageRepository.deleteById(id);
    }

    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    public Message getById(UUID id) {
        return messageRepository.findById(id).get();
    }
}
