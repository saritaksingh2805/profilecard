// Source code is decompiled from a .class file using FernFlower decompiler.
public class Bomb {
    public Bomb() {
    }
 
    public static void main(String[] var0) throws InterruptedException {
       int var1 = 10;
 
       do {
          System.out.println("" + var1 + " seconds until detonation.");
          --var1;
          Thread.sleep(1000L);
       } while(var1 != 0);
 
       System.out.println("BOOM");
    }
 }
 