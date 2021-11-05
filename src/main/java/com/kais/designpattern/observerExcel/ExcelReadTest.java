package com.kais.designpattern.observerExcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.Test;

/**
 * @author Kais
 * @create 2021-07-24-21:20
 */

/*
* 实现Excel文件的读取
* */
public class ExcelReadTest {

    /**
     * 最简单的读
     */
    @Test
    public void simpleReadXlsx() {

        String fileName = "c:/TestDecorator/simpleWrite.xlsx";
        // 这里默认读取第一个sheet
        EasyExcel.read(fileName, ExcelStudentDTO.class, new ExcelStudentDTOListener()).sheet().doRead();
    }

    @Test
    public void simpleReadXls() {

        String fileName = "c:/TestDecorator/simpleWrite.xls";
        EasyExcel.read(fileName, ExcelStudentDTO.class, new ExcelStudentDTOListener()).excelType(ExcelTypeEnum.XLS).sheet().doRead();
    }
}