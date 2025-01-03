package com.ll.multiChat.domain.chat.ChatRoom.dto;

import com.ll.multiChat.domain.chat.ChatMessage.entity.ChatMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WriteResponseBody {
    private ChatMessage message;
}