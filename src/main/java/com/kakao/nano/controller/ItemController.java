package com.kakao.nano.controller;

import com.kakao.nano.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "item")
public class ItemController {
    @Autowired
    private ItemService itemService;
}
