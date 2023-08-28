package com.sparta.travelshooting.chat.service;

import com.sparta.travelshooting.chat.dto.ChatMessageRequestDto;
import com.sparta.travelshooting.chat.dto.ChatMessageResponseDto;

public interface ChatMessageService {

    /**
     * 채팅 보내기
     *
     * @param chatRoomId            채팅을 보낼 채팅방 ID
     * @param chatMessageRequestDto 채팅 작성자 + 내용
     * @return 보내기 처리 완료된 채팅
     */
    ChatMessageResponseDto sendChat(Long chatRoomId, ChatMessageRequestDto chatMessageRequestDto);

}