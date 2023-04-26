import java.util.*;

public class A1113308_0421_1{
    public static void main(String[] argv) {
        Scanner input=new Scanner(System.in);
        String mail;
        boolean flag=false;
        do{
            System.out.println("請輸入電子郵件(名稱和網域皆只有小寫字母):");
            mail=input.next();
            if(mail.matches("([a-z]+)(@?)([a-z]+)")){
                System.out.println("正確格式");
                flag=true;
            }else{
                System.out.println("格式錯誤，請再次輸入");
            }
        }while(!flag);
    }
}
