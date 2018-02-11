package com.kakao.nano.controller;

import com.kakao.nano.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "order")
public class OrderController {
    @Autowired
    private OrderService orderService;
}
