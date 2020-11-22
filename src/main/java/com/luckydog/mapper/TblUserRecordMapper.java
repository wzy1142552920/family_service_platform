package com.luckydog.mapper;

import com.luckydog.bean.TblUserRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户档案 Mapper 接口
 * </p>
 *
 * @author luckydog
 * @since 2020-07-14
 */

@Component
public interface TblUserRecordMapper extends BaseMapper<TblUserRecord> {
    TblUserRecord login(@Param("username") String username, @Param("password") String password);
}
