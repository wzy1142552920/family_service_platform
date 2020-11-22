package com.luckydog.service.impl;

import com.luckydog.bean.TblEmployeeContact;
import com.luckydog.mapper.TblEmployeeContactMapper;
import com.luckydog.service.base.TblEmployeeContactService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工通讯录 服务实现类
 * </p>
 *
 * @author luckydog
 * @since 2020-07-14
 */
@Service
public class TblEmployeeContactServiceImpl extends ServiceImpl<TblEmployeeContactMapper, TblEmployeeContact> implements TblEmployeeContactService {

}
