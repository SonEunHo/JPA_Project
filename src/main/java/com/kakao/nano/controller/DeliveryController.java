package com.kakao.nano.controller;

import com.kakao.nano.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "delivery")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;
}
