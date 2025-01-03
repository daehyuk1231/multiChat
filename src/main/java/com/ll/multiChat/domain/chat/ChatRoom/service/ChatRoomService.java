package com.ll.multiChat.domain.chat.ChatRoom.service;

import com.ll.multiChat.domain.chat.ChatRoom.entity.ChatRoom;
import com.ll.multiChat.domain.chat.ChatRoom.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatRoomService {
    private final ChatRoomRepository chatRoomRepository;

    public ChatRoom make(String name) {
        ChatRoom chatRoom = ChatRoom.builder()
                .name(name)
                .build();

        chatRoomRepository.save(chatRoom);

        return chatRoom;
    }

    public void getList() {
        return chatRoomRepository.findAll();
    }

}
