package com.kais.designpattern.observerExcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author Kais
 * @create 2021-07-24-21:12
 */

@Data
public class ExcelStudentDTO {

    @ExcelProperty("姓名")
    private String name;

    @ExcelProperty("生日")
    private Date birthday;

    @ExcelProperty("薪资")
    private Double salary;

}
