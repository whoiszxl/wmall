package com.whoiszxl.wmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whoiszxl.common.utils.PageUtils;
import com.whoiszxl.wmall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author whoiszxl
 * @email whoiszxl@gmail.com
 * @date 2020-05-28 07:12:33
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

