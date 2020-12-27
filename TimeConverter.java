public class TimeConverter {
    static String timeConversion(String str) {
        String[] strArr = str.split(":");
        boolean isAM = strArr[2].contains("AM");
        if(isAM){
            str = strArr[0].equals("12") ? "00": strArr[0];
            str += ":" + strArr[1] + ":" + strArr[2].substring(0, 2);
        }else{
            Integer hour = Integer.parseInt(strArr[0]);
            //hour = 0,1,2,3,4,5,6,7,8,9,10,11,12
            hour = hour == 12 ? 12: hour+12;
            str = hour.toString();
            if(hour < 10) str = "0" + str;
            str += ":" + strArr[1] + ":" + strArr[2].substring(0, 2);

        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:05:45PM"));
    }
}
