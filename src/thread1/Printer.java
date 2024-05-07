package thread1;

public class Printer extends Thread{

    private String name ;


    public Printer(String name){
        this.name = name ;

    }

    @Override
    public void run() {
        System.out.println(name + "Çalışıyor...");

        for (int i = 0 ; i<= 10 ; i++){
            System.out.println(name + " Yazıyor " + i );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı ");
            }
        }
        System.out.println(name + "işini bitirdi");
    }
}
