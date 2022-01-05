package com.icia.member.controller;

import com.icia.member.dto.MemberLoginDTO;
import com.icia.member.dto.MemberSaveDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/member/*")
public class MemberController {



    @GetMapping("saveForm")
    public String saveForm(Model model){
        model.addAttribute( "member", new MemberSaveDTO());
        return "member/save";
    }

    @PostMapping("save")
    public String save(@Validated @ModelAttribute("member") MemberSaveDTO member, BindingResult bindingResult){
        System.out.println(member);

        if(bindingResult.hasErrors()){
            return "member/save";
        }
        return "redirect:/member/loginForm";
    }

    @GetMapping("loginForm")
    public  String loginForm(Model model){
        model.addAttribute("member",new MemberLoginDTO());
        return "member/login";
    }

    @PostMapping("login")
    public String login(@Validated @ModelAttribute("member") MemberLoginDTO member, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "member/login";
        }
        return "index";
    }
}
