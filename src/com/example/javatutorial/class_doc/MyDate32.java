package com.example.javatutorial.class_doc;

public class MyDate32 {
    private  int day;
    private int month ;
    private int year;

    public MyDate32 (int day, int month , int year){
        if(day>= 1 && day<= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }

        if(month >= 1 && month <=12) {
            this.month = month ;
        }else {
            this.month = 1;
        }

        if(year >=1){
            this.year = year;
        }else {
            this.year = 1;
        }

    }

    // Phải chuột vào intelliJ  chọn generate -> chọn geter and setter
    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if(day >= 1 && day<=31)
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12)
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1)
        this.year = year;
    }
//// Bài 32 : Phương thức toString()
//    @Override
//    public String toString() {
//        return "MyDate32{" +
//                "day=" + day +
//                ", month=" + month +
//                ", year=" + year +
//                '}';
//    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    //// Bài 34: Phương thức so sánh equals và hascode


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + month;
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        MyDate32 other = (MyDate32) obj;  // Gán ép obj thành kiểu dữ liệu obj
        if (this.day != other.day)
            return false;
        if (this.month != other.month)
            return false;
        if (this.year != other.year)
            return false;
        return true;
    }

}
