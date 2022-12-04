package com.bingo.bingomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bingo.common.utils.PageUtils;
import com.bingo.bingomall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author bingo
 * @email bingo@gmail.com
 * @date 2022-12-04 22:42:48
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

