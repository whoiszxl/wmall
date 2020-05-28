package com.whoiszxl.wmall.member.dao;

import com.whoiszxl.wmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author whoiszxl
 * @email whoiszxl@gmail.com
 * @date 2020-05-27 23:10:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
