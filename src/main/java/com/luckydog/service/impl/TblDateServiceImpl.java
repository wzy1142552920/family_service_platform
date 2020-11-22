package com.luckydog.service.impl;

import com.luckydog.bean.TblDate;
import com.luckydog.mapper.TblDateMapper;
import com.luckydog.service.base.TblDateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工作日期 服务实现类
 * </p>
 *
 * @author luckydog
 * @since 2020-07-14
 */
@Service
public class TblDateServiceImpl extends ServiceImpl<TblDateMapper, TblDate> implements TblDateService {

}
