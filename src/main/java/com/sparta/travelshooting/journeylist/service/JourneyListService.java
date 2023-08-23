package com.sparta.travelshooting.journeylist.service;

import com.sparta.travelshooting.journeylist.dto.JourneyListRequestDto;
import com.sparta.travelshooting.journeylist.dto.JourneyListResponseDto;
import com.sparta.travelshooting.journeylist.entity.JourneyList;
import com.sparta.travelshooting.journeylist.repository.JourneyListRepository;
import com.sparta.travelshooting.post.entity.Post;
import com.sparta.travelshooting.post.repository.PostRepository;
import com.sparta.travelshooting.user.entity.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class JourneyListService {

    private final JourneyListRepository journeyListRepository;
    private final PostRepository postRepository;

    // 여행 일정 (팝업창) 생성
    @Transactional
    public JourneyListResponseDto createJourney(Long postId, JourneyListRequestDto journeyListRequestDto) {
        Optional<Post> post = postRepository.findById(postId);
        if (post.isEmpty()) {
            throw new NullPointerException("해당 게시글은 존재하지 않습니다.");
        }
        JourneyList journeyList = new JourneyList(journeyListRequestDto, post.get());
        journeyListRepository.save(journeyList);
        return new JourneyListResponseDto(journeyList);
    }

//    @Transactional
//    public void createJourney(Long postId, JourneyListRequestDto journeyListRequestDto) {
//
//    }
}