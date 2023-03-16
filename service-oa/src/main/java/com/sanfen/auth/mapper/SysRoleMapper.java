package com.sanfen.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sanfen.model.system.SysRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色mapper
 * @author HeJin
 * @version 1.0
 * @since 2023/03/16 22:09
 */
@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {
}