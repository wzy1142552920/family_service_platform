package com.luckydog.service.impl;

import com.luckydog.bean.TblLoginLog;
import com.luckydog.mapper.TblLoginLogMapper;
import com.luckydog.service.base.TblLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志 服务实现类
 * </p>
 *
 * @author luckydog
 * @since 2020-07-14
 */
@Service
public class TblLoginLogServiceImpl extends ServiceImpl<TblLoginLogMapper, TblLoginLog> implements TblLoginLogService {

}
