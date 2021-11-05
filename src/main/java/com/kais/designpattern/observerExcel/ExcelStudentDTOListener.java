package com.kais.designpattern.observerExcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Kais
 * @create 2021-07-24-21:20
 */

/*
* 创建监听器
* */
@Slf4j
public class ExcelStudentDTOListener extends AnalysisEventListener<ExcelStudentDTO> {

    /**
     * 这个每一条数据解析都会来调用
     */
    @Override
    public void invoke(ExcelStudentDTO data, AnalysisContext context) {
        log.info("解析到一条数据:{}", data);

    }

    /**
     * 所有数据解析完成了 都会来调用
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("所有数据解析完成！");
    }
}