package com.whoiszxl.wmall.product.dao;

import com.whoiszxl.wmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author whoiszxl
 * @email whoiszxl@gmail.com
 * @date 2020-05-28 07:12:33
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
