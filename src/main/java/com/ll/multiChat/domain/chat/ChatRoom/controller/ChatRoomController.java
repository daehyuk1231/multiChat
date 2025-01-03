package com.ll.multiChat.domain.chat.ChatRoom.controller;

import com.ll.multiChat.domain.chat.ChatRoom.entity.ChatRoom;
import com.ll.multiChat.domain.chat.ChatRoom.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/chat/room")
public class ChatRoomController {
    private final ChatRoomService chatRoomService;

    @GetMapping("/{roomId}")
    @ResponseBody
    public String showRoom(@PathVariable long roomId, @RequestParam(defaultValue = "NoName") String writerName) {

        return "domain/chat/chatRoom/room";
    }

    @GetMapping("/make")
    public String showMakeRoom() {
        return "domain/chat/chatRoom/make";
    }

    @GetMapping("/make")
    public String makeRoom(String name) {
        chatRoomService.make(name);
        return "domain/chat/room/list";
    }

    @GetMapping("/list")
    public String roomlist(Model model) {
        List<ChatRoom> chatRooms = chatRoomService.getList();

        model.addAttribute("chatRooms", chatRooms);
        return "domain/chat/chatRoom/list";
    }
}