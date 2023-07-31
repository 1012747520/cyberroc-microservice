package com.example.cyberPunk.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.cyberPunk.entity.Dishes;
import com.example.cyberPunk.pojo.dishes;
import java.util.List;

import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Resource
public interface DishesMapper extends BaseMapper<Dishes> {
    List<Dishes> getAllDishes();
}

