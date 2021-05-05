package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class DateController {
    //跳转到查询页面
    @RequestMapping("/toDate")
    public String toDate(){
        return "selectdate";
    }
    //星期查询
    @RequestMapping("/question")
    public String selectDate(String date, int year, Model model) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        calendar.setTime(sdf.parse(date));
        calendar.add(calendar.YEAR,year);   //增加年份

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");   //增加年份后的日期
        SimpleDateFormat sdf2 = new SimpleDateFormat("E");            //增加年份后的星期

        String dateString1 = sdf1.format(calendar.getTime());               //转换成字符串格式
        String dateString2 = sdf2.format(calendar.getTime());

        model.addAttribute("date",date);
        model.addAttribute("year",year);
        model.addAttribute("dateString1",dateString1);
        model.addAttribute("dateString2",dateString2);
        return "resulet";
    }
}
