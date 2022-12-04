package com.bingo.bingomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bingo.common.utils.PageUtils;
import com.bingo.bingomall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author bingo
 * @email bingo@gmail.com
 * @date 2022-12-04 22:42:48
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

