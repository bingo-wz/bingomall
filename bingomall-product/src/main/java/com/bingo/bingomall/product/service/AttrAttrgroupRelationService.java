package com.bingo.bingomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bingo.common.utils.PageUtils;
import com.bingo.bingomall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author bingo
 * @email bingo@gmail.com
 * @date 2022-12-04 22:42:48
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

