package com.rochanahuel.WebSocket.repository;

import com.rochanahuel.WebSocket.model.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatMessageRepository extends MongoRepository<ChatMessage,String> {
    List<ChatMessage> findByChatId(String s);
}
