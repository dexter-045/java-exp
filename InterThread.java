class MyClass {
    int n;
    boolean flag = false;

    synchronized int get() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException!!!");
            }
        }
        System.out.println("Consumer consuming: " + n);
        flag = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException!!!");
            }
        }

        this.n = n;
        flag = true;
        System.out.println("Producer producing: " + n);
        notify();
    }
}

class Procedure implements Runnable {
    MyClass obj;

    Procedure(MyClass obj) {
        this.obj = obj;
        new Thread(this, "Procedure").start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            obj.put(i);
        }
    }
}

class Consumer implements Runnable {
    MyClass obj;

    Consumer(MyClass obj) {
        this.obj = obj;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            obj.get();
        }
    }
}

class InterThread {
    public static void main(String[] args) {
        MyClass TObj = new MyClass();
        new Procedure(TObj);
        new Consumer(TObj);
    }
}
