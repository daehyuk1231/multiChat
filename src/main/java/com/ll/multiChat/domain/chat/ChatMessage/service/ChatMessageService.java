package com.ll.multiChat.domain.chat.ChatMessage.service;

import com.ll.multiChat.domain.chat.ChatMessage.entity.ChatMessage;
import com.ll.multiChat.domain.chat.ChatMessage.repository.ChatMessageRepository;
import com.ll.multiChat.domain.chat.ChatRoom.entity.ChatRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatMessageService {
    private final ChatMessageRepository chatMessageRepository;

    public void write(ChatRoom chatRoom, String writerName, String content){
        ChatMessage chatMessage = ChatMessage.builder()
                .chatRoom(chatRoom)
                .writerName(writerName)
                .content(content)
                .build();

        chatMessageRepository.save(chatMessage);
    }
}