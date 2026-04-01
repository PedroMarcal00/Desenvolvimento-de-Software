public class Time2Test {
    
    public static void main(String[] args) {
        
        Time2 t1 = new Time2(0);
        Time2 t2 = new Time2(0, 0);
        Time2 t3 = new Time2(0, 0, 0);

        t1.setTime(15, 0, 0);
        t2.setTime(15, 22, 0);
        t3.setTime(15, 22, 33);
        
        System.out.println("t1: " + t1.toUniversalString());
        System.out.println("t2: " + t2.toUniversalString());
        System.out.println("t3: " + t3.toUniversalString() + "\n");

        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());
        System.out.println("t3: " + t3.toString() + "\n");


        System.out.println("Tempo separado do T1: ");
        t1.getHora();
        t1.getMinuto();
        t1.getSegundo();

        System.out.println("Tempo separado do T2: ");
        t2.getHora();
        t2.getMinuto();
        t2.getSegundo();

        System.out.println("Tempo separado do T3: ");
        t3.getHora();
        t3.getMinuto();
        t3.getSegundo();

    }
    
}
