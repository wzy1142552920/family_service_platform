package com.luckydog.service.impl;

import com.luckydog.bean.TblCommonMessage;
import com.luckydog.mapper.TblCommonMessageMapper;
import com.luckydog.service.base.TblCommonMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 常用短信 服务实现类
 * </p>
 *
 * @author luckydog
 * @since 2020-07-14
 */
@Service
public class TblCommonMessageServiceImpl extends ServiceImpl<TblCommonMessageMapper, TblCommonMessage> implements TblCommonMessageService {

}
