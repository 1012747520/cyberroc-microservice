package com.example.cyberPunk.service.impl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cyberPunk.entity.Dishes;
import com.example.cyberPunk.mapper.DishesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cyberPunk.pojo.dishes;
import com.example.cyberPunk.service.dishesService;
import java.util.List;


// dishesService.java
@Service
public class dishesServiceImpl implements dishesService {
    @Autowired
    private  DishesMapper dishesMapper;

    @Override
    public List<Dishes> getAllDishes() {
        return dishesMapper.getAllDishes();
    }


}
