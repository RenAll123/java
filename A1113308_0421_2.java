import java.util.*;

public class A1113308_0421_2{
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        String date;
        boolean flag=false;
        do{
            System.out.println("請輸入日期(YYYY/MM/DD或是MM/DD/YYYY):");
            date=input.next();
            if(date.matches("([0-9]{4})(/?)([0-1]{1})([0-9]{1})(/?)([0-3]{1}[0-9]{1})") || date.matches("([0-1]{1})([0-9]{1})(/?)([0-3]{1}[0-9]{1})(/?)([0-9]{4})")){
                if(date.matches("([0-9]{4})(/?)([0-1]{1})([0-9]{1})(/?)([0-3]{1}[0-9]{1})")){
                    System.out.print(date.substring(0,4)+"年");
                    System.out.print(date.substring(5,7)+"月");
                    System.out.print(date.substring(8,10)+"日");
                }else{
                    System.out.print(date.substring(6,10)+"年");
                    System.out.print(date.substring(0,2)+"月");
                    System.out.print(date.substring(3,5)+"日");
                }
                flag=true;
            }else{
                System.out.println("格式錯誤，請再次輸入");
            }
        }while(!flag);
    }   
}    