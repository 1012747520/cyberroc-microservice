package com.example.cyberPunk.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cyberPunk.entity.Dishes;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cyberPunk.pojo.dishes;
import java.util.List;
import com.example.cyberPunk.service.dishesService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@CrossOrigin
@RequestMapping("/getDishes")
public class dishesController {

    @Autowired
    private  dishesService  dishesService;
    @PostMapping
    public List<Dishes> getAllDishes() {
        return dishesService.getAllDishes();
    }
}
