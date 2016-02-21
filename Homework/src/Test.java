class Test implements Runnable {
    private Thread t;
    private String threadName;
    int first;
    int last;


    Test(String name, int first, int last) {
        threadName = name;
        this.first = first;
        this.last = last;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        for (int currentNumber = first; currentNumber < last; currentNumber++) {
            int dividers = 0;
            for (int i = 1; i <= currentNumber; i++) {
                if (currentNumber % i == 0)
                    dividers++;
            }
            if (dividers <= 2)
                System.out.print(currentNumber + " ");
        }
        System.out.println("---- Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

class TestRun {
    public static void main(String args[]) {

        Test t1 = new Test("Primes-1", 1, 100);
        t1.start();

        Test t2 = new Test("Primes-2", 6, 56);
        t2.start();

        Test t3 = new Test("Primes-3", 16, 156);
        t3.start();
    }
}