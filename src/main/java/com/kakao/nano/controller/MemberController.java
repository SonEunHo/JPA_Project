package com.kakao.nano.controller;

import com.kakao.nano.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.kakao.nano.service.MemberService;

import java.util.List;

@RestController(value="member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Member> findAll() {
        return memberService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Member save(@RequestBody Member member) {
        return memberService.saveMember(member);
    }
}