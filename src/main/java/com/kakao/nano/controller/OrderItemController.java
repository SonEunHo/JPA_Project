package com.kakao.nano.controller;

import com.kakao.nano.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;
}
