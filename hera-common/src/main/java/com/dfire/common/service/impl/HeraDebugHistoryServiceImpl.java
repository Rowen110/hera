package com.dfire.common.service.impl;

import com.dfire.common.entity.HeraDebugHistory;
import com.dfire.common.entity.vo.HeraDebugHistoryVo;
import com.dfire.common.mapper.HeraDebugHistoryMapper;
import com.dfire.common.service.HeraDebugHistoryService;
import com.dfire.common.util.BeanConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 下午7:27 2018/4/16
 * @desc
 */
@Service("heraDebugHistoryService")
public class HeraDebugHistoryServiceImpl implements HeraDebugHistoryService {

    @Autowired
    HeraDebugHistoryMapper heraDebugHistoryMapper;

    @Override
    public String insert(HeraDebugHistory heraDebugHistory) {
        heraDebugHistoryMapper.insert(heraDebugHistory);
        return heraDebugHistory.getId();
    }

    @Override
    public int delete(int id) {
        return heraDebugHistoryMapper.delete(id);
    }

    @Override
    public int update(HeraDebugHistory heraDebugHistory) {
        return heraDebugHistoryMapper.update(heraDebugHistory);
    }

    @Override
    public List<HeraDebugHistory> getAll() {
        return heraDebugHistoryMapper.getAll();
    }

    @Override
    public HeraDebugHistoryVo findById(String id) {
        HeraDebugHistory debugHistory = HeraDebugHistory.builder().id(id).build();
        HeraDebugHistory history = heraDebugHistoryMapper.findById(debugHistory);
        return BeanConvertUtils.convert(history);
    }

    @Override
    public List<HeraDebugHistory> findByFileId(Integer fileId) {
        return  heraDebugHistoryMapper.findByFileId(fileId);
    }

    @Override
    public int updateStatus(HeraDebugHistory heraDebugHistory) {
        return heraDebugHistoryMapper.updateStatus(heraDebugHistory);
    }

    @Override
    public int updateLog(HeraDebugHistory heraDebugHistory) {
        return heraDebugHistoryMapper.updateLog(heraDebugHistory);
    }

    @Override
    public HeraDebugHistory findLogById(Integer id) {
        return heraDebugHistoryMapper.findLogById(id);
    }


}
