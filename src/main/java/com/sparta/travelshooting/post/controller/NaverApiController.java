package com.sparta.travelshooting.post.controller;

import com.sparta.travelshooting.post.dto.NaverAddressDto;
import com.sparta.travelshooting.post.service.NaverApiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/server")
@Tag(name = "네이버 API")
public class NaverApiController {

    private final NaverApiService naverApiService;

//    @GetMapping ("/naver")
//    @ResponseBody
//    public List<NaverAddressDto> searchAddress (@RequestParam String query, Model model) {
//        return naverApiService.searchAddress(query);
//    }

    @Operation(summary = "네이버 검색 API")
    @GetMapping("/naver")
    public String searchAddress(@RequestParam String query, Model model) {
        List<NaverAddressDto> naverAddressDtoList = naverApiService.searchAddress(query);
        model.addAttribute("naverSearch", naverAddressDtoList);
        return "test";
    }
}
