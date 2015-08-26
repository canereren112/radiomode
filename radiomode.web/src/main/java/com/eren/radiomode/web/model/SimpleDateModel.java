/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.web.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Gun, ay, ve yil bilgilerini tasiyan nesne
 * @author work
 */
public class SimpleDateModel {

    private Calendar calendar;
    private int day;
    private int month;
    private int year;

    public SimpleDateModel(Date date) {
        calendar = Calendar.getInstance();
        calendar.setTime(date);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public SimpleDateModel(int day, int month, int year) throws ParseException {
        this.day = day;
        this.month = month;
        this.year = year;
        String dateString = year + "-" + month + "-" + day;
        SimpleDateFormat format = (SimpleDateFormat) new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(dateString);
        calendar = Calendar.getInstance();
        calendar.setTime(date);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getDate() {
        return calendar.getTime();
    }
}
