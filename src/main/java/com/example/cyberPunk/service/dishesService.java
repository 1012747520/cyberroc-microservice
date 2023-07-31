package com.example.cyberPunk.service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cyberPunk.entity.Dishes;
import com.example.cyberPunk.pojo.dishes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface dishesService {
    List<Dishes> getAllDishes();
}
