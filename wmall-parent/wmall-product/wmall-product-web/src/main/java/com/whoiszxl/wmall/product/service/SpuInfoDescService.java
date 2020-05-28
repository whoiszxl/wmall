package com.whoiszxl.wmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whoiszxl.common.utils.PageUtils;
import com.whoiszxl.wmall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author whoiszxl
 * @email whoiszxl@gmail.com
 * @date 2020-05-28 07:12:33
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

