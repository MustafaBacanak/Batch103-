package day29abstractioncollections;

public interface Engine extends Vehicle  {

    // Child     Parent
    //  ↓           ↓
    //Class --> Interface ==> implements
    //Class --> Class ==> extends
    //Interface --> Interface ==> extends
    //Interface --> Class ==> Mumkun degil (Class interface'in parentsi olamaz.)

    //interfacelerdeki tum variable'lar otomatik olarak(default) "public"dir.
    //interfacelerdeki tum variable'lar otomatik olarak(default) "final"dir.
    //interfacelerdeki tum variable'lar otomatik olarak(default) "static"dir.

    int v1=2000;
    double weight =23.5;

    void run();

}
