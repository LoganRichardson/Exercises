package misc;

public class Date {
    int month;
    int day;
    int year;
    
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this. year = year;
    }
    
    public void setMonth(int sMonth){
        month = sMonth;
    }
    
    public void setDay(int sDay){
        day = sDay;
    }
    
    public void setYear(int sYear){
        year = sYear;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDay(){
        return day; 
    }
    
    public int getYear(){
        return year;
    }
    
    public String displayDate(){
        String date =  month + "/" + day + "/" + year;
        return date;
    }
}
