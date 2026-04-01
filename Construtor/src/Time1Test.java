public class Time1Test {
    
    public static void main(String[] args) {
        Time1 time = new Time1();
        System.out.print("Valor universal inicial de time: ");
        System.out.println(time.toUniversalString());
        System.out.print("Valor default inicial de time: ");
        System.out.println(time.toString() + "\n");

        time.setTime(50, 70, 80);
        System.out.print("Valor universal depois de setTime: ");
        System.out.println(time.toUniversalString());
        System.out.print("Valor default depois de setTime: ");
        System.out.println(time.toString() + "\n");
    }

}
