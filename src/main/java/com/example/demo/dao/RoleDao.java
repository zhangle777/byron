package com.example.demo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author byron
 * @date 2018/12/19 11:01
 */
@Component
@Mapper
public interface RoleDao extends BaseMapper<Role> {

}