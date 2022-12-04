package com.bingo.bingomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bingo.common.utils.PageUtils;
import com.bingo.bingomall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author bingo
 * @email bingo@gmail.com
 * @date 2022-12-04 22:42:48
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

