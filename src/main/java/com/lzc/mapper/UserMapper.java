package com.lzc.mapper;

import com.lzc.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2021-08-23
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> fingAll();
}
