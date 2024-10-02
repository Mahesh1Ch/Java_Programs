package com.p1;
interface P2interface
{
    void p2();
}

public class P2Main implements P2interface
{
    public void p2()
    {
        System.out.println("p2 method in P2Interface");
    }

    public static void main(String args[])
    {
        System.out.println("Hello");
        P2Main p2 = new P2Main();
        p2.p2();
    }

}
