import java.util.*;
import java.util.concurrent.CyclicBarrier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static class A {
        void red() {
            System.out.println("Parent");
        }
    }

    static class B extends A {
        void red() {
            System.out.println("child");
        }
    }

    static abstract class Shape {
        int x;

        Shape(int x) {
            this.x = x;
        }

        abstract double area();
    }

    interface Color {
        void col(int s);
    }

    static class Square extends Shape implements Color {

        public void printList(List<?> list) {
            for (Object obj : list) {
                System.out.print(obj + " ");
            }
            System.out.println();
        }


        int r;

        Square(int r) {
            super(9);
            this.r = r;
            System.out.println(super.x + "   " + this.x);
        }

        @Override
        double area() {
            return Math.PI * r * r;
        }

        @Override
        public void col(int s) {

        }
    }

     interface InheritanceIMP{
        int r=0;

        //cannot have constructor
//        InheritanceIMP(){
//
//        }
       default void work(int n){
          System.out.println(r+n);
        }
        void work();
       private void dot(){
           work(9);
       }
    }
    abstract class Animal{
        int g=9;
        //can  have  constructor
        Animal(int h){
            System.out.println(h);
        }
        //can have default method
//        default void ed(int t){
//
//        }
        public static void A(){
            System.out.println("working");
        }
        public abstract void g();
        private static void s(){
            A();
        }
    }
    static class D{
        int count=0;
        synchronized void increment(){
            count= 9 +2;
            System.out.println(count);
        }
    }
     static class G extends Thread{
         int g=0;

         public G(int g) {
             this.g = g;

         }

         D d;


         @Override
         public void run() {
             d.increment();
         }
     }
    static class thisKeyIMP{
        int r=9;
//        thisKeyIMP(){
//            System.out.println("First Constructor");
//        }
//        thisKeyIMP(int r){
//            this();
//            System.out.println(r);
//        }
//        thisKeyIMP(String r){
//            this(9);
//            System.out.println("r Keyword");
//        }
    }
    static class superIMP extends thisKeyIMP{
        int f=8;
        superIMP(){
            System.out.println(super.r+"   "+this.f);
        }

    }
    static class Task implements Runnable {

        private CyclicBarrier barrier;

        Task(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " working...");
                Thread.sleep(1000);

                System.out.println(Thread.currentThread().getName() + " waiting at barrier");
                barrier.await(); // wait for others

                System.out.println(Thread.currentThread().getName() + " crossed barrier");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
       static class Ant extends Thread{
            public static volatile int num=3;
            public void run(){
                System.out.println(num++);
            }
       }

        static int count = 76;
        static class student{
            student(){
                System.out.println("working");
            }
        }
        interface payment{
            void payment();
        }
        static class UPIPayment implements payment{

            @Override
            public void payment() {
                System.out.println("Payment is done by UPI");
            }
        }
        static class CreditCardPayment implements payment{

            @Override
            public void payment() {
                System.out.println("Payment done by CreditCard");
            }
        }
        static class paymentFactory{
            public static payment getPayment(String type){
                if(type.equalsIgnoreCase("UPI")){
                    return new UPIPayment();
                }else if(type.equalsIgnoreCase("creditCard")){
                    return new CreditCardPayment();
                }
                throw new IllegalArgumentException("There is no such type of payment");
            }
        }
        static class User{

            User setName(String name){
                return this;
            }
            User setphoneNumber(int number){
                return this;
            }
            // private constructor
            private User() {}

            // static builder method
            public static User builder() {
                return new User();
            }
             String reverseAString(String r){
                String[] ar=r.split(" ");
                for(int i=0;i<ar.length;i++){
                    for(int j=ar[i].length();j>-1;j--){
                        ar[i]+=ar[j];
                    }
                }
                return "";
            }
        }

        public static void main(String[] args) throws InterruptedException {
//                User u=User.builder()
//                        .setName("ssss")
//                        .setphoneNumber(75838);
                GreaterThan s=new GreaterThan();
                int[] arr={1,2,3,4,5,6};
                System.out.println(s.greaterthan(arr));
            }
        }
   }

