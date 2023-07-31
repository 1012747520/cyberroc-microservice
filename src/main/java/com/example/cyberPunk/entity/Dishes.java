package com.example.cyberPunk.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@TableName("dishes")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class Dishes implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String dish;
    private String dishNm;
    private String materials;

}
