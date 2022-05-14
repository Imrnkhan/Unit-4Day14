package Unit4Day14.Question3;

class Common {
    public void fun1(String name) {
        synchronized (this) {
            System.out.print("Welcome :");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        Common c1 = new Common();
        c1.fun1("Imran");
    }
}

// 3)Write the fun1() method of Common class using synchronised block to get the
// Class level lock. (You problem from notes)