package com.sparta.travelshooting.post.service;

import com.sparta.travelshooting.common.ApiResponseDto;
import com.sparta.travelshooting.journeylist.controller.JourneyListController;
import com.sparta.travelshooting.journeylist.dto.JourneyListRequestDto;
import com.sparta.travelshooting.journeylist.dto.JourneyListResponseDto;
import com.sparta.travelshooting.journeylist.entity.JourneyList;
import com.sparta.travelshooting.journeylist.repository.JourneyListRepository;
import com.sparta.travelshooting.journeylist.service.JourneyListService;
import com.sparta.travelshooting.post.controller.NaverApiController;
import com.sparta.travelshooting.post.dto.*;
import com.sparta.travelshooting.post.entity.Post;
import com.sparta.travelshooting.post.entity.PostLike;
import com.sparta.travelshooting.post.repository.PostLikeRepository;
import com.sparta.travelshooting.post.repository.PostRepository;
import com.sparta.travelshooting.user.entity.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final NaverApiController naverApiController;
    private final PostLikeRepository postLikeRepository;

    // 게시글 생성
    @Transactional
    public PostResponseDto createPost(PostRequestDto postRequestDto, User user) {
        List<JourneyList> journeyList = new ArrayList<>();
        Post post = new Post(postRequestDto, journeyList, user);
        postRepository.save(post);

        return new PostResponseDto(post);
    }


    // 게시글 전체 조회
    public List<PostResponseDto> getPosts() {
        List<Post> postList = postRepository.findAll();

        return postList.stream()
                .map(PostResponseDto::new)
                .collect(Collectors.toList());
    }

    // 게시글 단건 조회
    public PostResponseDto getPost(Long postId) {
        Optional<Post> post = postRepository.findById(postId);
        if (post.isEmpty()) {
            throw new IllegalArgumentException("해당 글은 존재하지 않습니다.");
        }
        return new PostResponseDto(post.get());
    }

    //게시글 수정
    @Transactional
    public PostResponseDto updatePost(PostRequestDto postRequestDto, Long postId, User user) {
        Optional<Post> post = postRepository.findById(postId);
        if (post.isEmpty()) {
            throw new IllegalArgumentException("해당 글은 존재하지 않습니다.");
        }
        post.get().setTitle(postRequestDto.getTitle());
        post.get().setContents(postRequestDto.getContents());
        return new PostResponseDto(postRepository.save(post.get()));
    }

    //게시글 삭제
    @Transactional
    public ApiResponseDto deletePost(Long postId, User user) {
        Optional<Post> post = postRepository.findById(postId);
        if (post.isEmpty()) {
            throw new IllegalArgumentException("해당 글은 존재하지 않습니다.");
        }
        postRepository.deleteById(postId);
        return new ApiResponseDto("게시글 삭제 성공", 200);
    }

    //좋아요 기능
    @Transactional
    public ApiResponseDto addLike(Long postId, User user) {
        Optional<Post> post = postRepository.findById(postId);
        Optional<PostLike> findpostLike = postLikeRepository.findByPostIdAndUserId(postId, user.getId());
        if (post.isEmpty()) {
            throw new IllegalArgumentException("해당 글은 존재하지 않습니다.");
        } else if (post.get().getUser().getId().equals(user.getId())) {
            return new ApiResponseDto("자신의 글에는 좋아요를 할 수 없습니다.", 400);
        } else if (findpostLike.isPresent()) {
            return new ApiResponseDto("이미 좋아요를 한 상태입니다.", 400);
        }
        postLikeRepository.save(new PostLike(user, post.get()));
        post.get().setLikeCounts(post.get().getLikeCounts() + 1);
        postRepository.save(post.get());
        return new ApiResponseDto("좋아요 등록 성공", 200);
    }


    @Transactional
    public ApiResponseDto deleteLike(Long postId, User user) {
        Optional<Post> post = postRepository.findById(postId);
        Optional<PostLike> findpostLike = postLikeRepository.findByPostIdAndUserId(postId, user.getId());
        if (post.isEmpty()) {
            throw new IllegalArgumentException("해당 글은 존재하지 않습니다.");
        } else if (findpostLike.isEmpty()) {
            return new ApiResponseDto("해당 글에 좋아요를 하지 않은 상태입니다.", 400);
        }
        postLikeRepository.delete(findpostLike.get());
        post.get().setLikeCounts(post.get().getLikeCounts() - 1);
        postRepository.save(post.get());
        return new ApiResponseDto("좋아요 취소 성공", 200);
    }
}