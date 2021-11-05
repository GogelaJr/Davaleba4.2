package com.company;

public class A {

    int a;
    int b;
    int[] c = new int[12];

    public void one(){
        System.out.println("A1-------------");
        a = rand(10,25);
        b = rand(10,25);
        System.out.println("A: "+a);
        System.out.println("B: "+b);
    }
    public int[] two(){
        System.out.println("A2---------------");
        int[] really = new int[2];
        really[0] = a ;
        really[1] = b;
        System.out.println(really[0]+"\n"+really[1]);
        return really;

    }

    public void four(){
        System.out.println("A4-----------------");
        for (int i = 0; i < c.length; i++){
            c[i] =  rand(-10,60);
            System.out.println(c[i]);
        }
    }

    public void five(){
        System.out.println("A5 ----------------");

        for(int i = 0; i<c.length; i++){
            if(c[i]%2==0){
                System.out.println(c[i]);

            }

        }

    }
    public void six(){
        System.out.println("A6 ----------------");
        for (int i = 0; i<c.length; i++){
            if(c[i]>0){
                System.out.println(c[i]);
            }
        }

    }
    public void seven(){
        System.out.println("A7 ----------------");
        int sm = 0;
        for(int i = 0; i<c.length; i++){
            if (c[i]>0){
                sm = c[i];
                break;
            }
        }
        for (int i =0; i < c.length; i++){
            if(sm > c[i]&&c[i]>0){
                sm = c[i];

            }

        }
        System.out.println(sm);
    }



    public int rand(int mi,int ma){
        return (int)((Math.random()*(ma-mi))+mi); /// ეს რატომ არის ასეთი რაღაცნაირი უცნაური?
    }
}
