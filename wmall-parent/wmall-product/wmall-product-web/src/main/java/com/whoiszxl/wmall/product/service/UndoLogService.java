package com.whoiszxl.wmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.whoiszxl.common.utils.PageUtils;
import com.whoiszxl.wmall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author whoiszxl
 * @email whoiszxl@gmail.com
 * @date 2020-05-28 07:12:33
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

