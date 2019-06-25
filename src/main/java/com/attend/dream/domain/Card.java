package com.attend.dream.domain;


import lombok.Data;

import java.util.Date;
@Data
public class Card {
    private int id;
    //打卡人编码
    private String cardCode;
    //打卡人姓名
    private String name;
    //打卡人日期
    private Date date;
    //是否要补卡
    private String isRepair;
}
