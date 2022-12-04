package com.bingo.bingomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bingo.common.utils.PageUtils;
import com.bingo.bingomall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author bingo
 * @email bingo@gmail.com
 * @date 2022-12-04 22:42:48
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

