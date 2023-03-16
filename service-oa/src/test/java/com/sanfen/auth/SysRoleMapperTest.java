package com.sanfen.auth;


import com.sanfen.auth.mapper.SysRoleMapper;
import com.sanfen.model.system.SysRole;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author HeJin
 * @version 1.0
 * @since 2023/03/16 22:10
 */
@Slf4j
@SpringBootTest
public class SysRoleMapperTest {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Test
    public void testSelectList() {
        log.debug("----- selectAll method test ------");

        List<SysRole> users = sysRoleMapper.selectList(null);
        users.forEach(user -> log.debug("user = {}", user));
    }

}