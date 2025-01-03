package com.ll.multiChat.global.initData;

import com.ll.multiChat.domain.chat.ChatRoom.service.ChatRoomService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.stream.IntStream;

@Configuration
@Profile("!prod")
public class NotProd {

    @Bean
    public ApplicationRunner initNotProd(ChatRoomService chatRoomService) {
        return args -> {
            chatRoomService.make("공부");
            chatRoomService.make("식사");
            chatRoomService.make("휴식");

            IntStream.rangeClosed(1, 100).forEach(num -> {
            });

        };
    }
}
