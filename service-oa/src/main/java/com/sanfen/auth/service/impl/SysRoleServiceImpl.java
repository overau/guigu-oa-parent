package com.sanfen.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sanfen.auth.mapper.SysRoleMapper;
import com.sanfen.auth.service.SysRoleService;
import com.sanfen.model.system.SysRole;
import org.springframework.stereotype.Service;

/**
 * SysRoleService实现
 * @author HeJin
 * @version 1.0
 * @since 2023/03/16 22:30
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}
