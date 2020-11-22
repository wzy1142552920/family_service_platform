package com.luckydog.service.impl;

import com.luckydog.bean.TblMyNote;
import com.luckydog.mapper.TblMyNoteMapper;
import com.luckydog.service.base.TblMyNoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 我的记事本 服务实现类
 * </p>
 *
 * @author luckydog
 * @since 2020-07-14
 */
@Service
public class TblMyNoteServiceImpl extends ServiceImpl<TblMyNoteMapper, TblMyNote> implements TblMyNoteService {

}
