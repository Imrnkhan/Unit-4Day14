package Unit4Day14.Question1;

public class Main {
    public static void main(String[] args){

        ThreadA a = new ThreadA();
        a.start();
    }
}


// 1)Make a thread that will calculate a product of 10 digits and another thread (main thread ) will print the calculated value of the first thread.