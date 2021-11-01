package com.sparata.week03.controller;


import com.sparata.week03.domain.Memo;
import com.sparata.week03.domain.MemoRepository;
import com.sparata.week03.domain.MemoRequestDto;
import com.sparata.week03.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
@RestController("/api/memos")
public class MemoController {

    private final MemoRepository memoRepository;
    private final MemoService memoService;

    @PostMapping
    public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }
}