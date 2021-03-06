package com.gsafety.test.unit18;

public class SubThread implements Runnable{
    private static int count;

    public SubThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (true){
            synchronized ("") {
                count--;
                System.out.println(Thread.currentThread().getName()+" 开始在控制台第" + count + "次打印本段文字！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
