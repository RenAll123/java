import java.util.Random;
import java.util.Scanner;

class Customer implements Runnable {
    private String name;
    private int numCustomers;
    private int maxDumplings;

    private static Object lock = new Object();
    private static int porkDumplings = 5000;
    private static int beefDumplings = 3000;
    private static int veggieDumplings = 1000;

    public Customer(String name, int numCustomers, int maxDumplings) {
        this.name = name;
        this.numCustomers = numCustomers;
        this.maxDumplings = maxDumplings;
}

public void run() {
    try {
        System.out.println(name + " 開始點餐...");
        Thread.sleep(3000); // 等待服務生的時間

        Random rand = new Random();
        int dumplingsOrdered = rand.nextInt(maxDumplings - 10 + 1) + 10; // 亂數產生點餐數量
        int dumplingsType = rand.nextInt(3); // 亂數選取水餃種類

        synchronized (lock) {
            switch (dumplingsType){
                case 0: // 豬肉水餃
                    if (porkDumplings >= dumplingsOrdered) {
                        porkDumplings -= dumplingsOrdered;
                        System.out.println(name + " 訂購了 " + dumplingsOrdered + " 顆豬肉水餃");
                        System.out.println("剩餘豬肉水餃數量: " + porkDumplings);
                    } else {
                        System.out.println(name + " 訂購了 " + dumplingsOrdered + " 顆豬肉水餃");
                        System.out.println("豬肉水餃售完為止。");
                    }
                    break;
                case 1: // 牛肉水餃
                    if (beefDumplings >= dumplingsOrdered) {
                        beefDumplings -= dumplingsOrdered;
                        System.out.println(name + " 訂購了 " + dumplingsOrdered + " 顆牛肉水餃");
                        System.out.println("剩餘牛肉水餃數量: " + beefDumplings);
                    } else {
                        System.out.println(name + " 訂購了 " + dumplingsOrdered + " 顆牛肉水餃");
                        System.out.println("牛肉水餃售完為止。");
                    }
                    break;
                case 2: // 蔬菜水餃
                    if (veggieDumplings >= dumplingsOrdered) {
                        veggieDumplings -= dumplingsOrdered;
                        System.out.println(name + " 訂購了 " + dumplingsOrdered + " 顆蔬菜水餃");
                        System.out.println("剩餘蔬菜水餃數量: " + veggieDumplings);
                    } else {
                        System.out.println(name + " 訂購了 " + dumplingsOrdered + " 顆蔬菜水餃");
                        System.out.println("蔬菜水餃售完為止。");
                    }
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class A1113308_0512{
    public static void main(String[] argv) throws InterruptedException {
        int numCustomers;// 使用者輸入的同時光顧的顧客數目
        int maxDumplings = 50; // 每位顧客每次可同時點的水餃數量上限
        Scanner input=new Scanner(System.in);
        System.out.println("請輸入顧客數量");
        numCustomers=input.nextInt();
        Thread[] customerThreads = new Thread[numCustomers];
        for(int i = 0; i < numCustomers; i++) {
            customerThreads[i] = new Thread(new Customer("顧客" + (i + 1), numCustomers, maxDumplings));
            customerThreads[i].start();
            Thread.sleep(3000);
        }
        for (int i = 0; i < numCustomers; i++) {
            try {
                customerThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
