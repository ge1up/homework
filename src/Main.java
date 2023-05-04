public class Main {
    static Boolean flag = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while(true) {
                if (!flag) {
                    System.out.println("A");
                    flag = true;
                } else {
                    System.out.println("B");
                    flag = false;
                }
            }
        });
        Thread thread2 = new Thread(() -> {
           while(true) {
               if (flag) {
                   System.out.println("B");
                   flag = false;
               } else {
                   System.out.println("A");
                   flag = true;
               }
           }
        });
        thread1.start();
        thread2.start();
    }
}