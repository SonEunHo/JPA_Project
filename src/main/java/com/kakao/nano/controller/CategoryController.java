package com.kakao.nano.controller;

import com.kakao.nano.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
}
