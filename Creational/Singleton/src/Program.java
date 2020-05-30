public class Program {
    public static void main(String[] args) {
        {
            Singleton1 s1 = Singleton1.getInstance();
            Singleton1 s2 = Singleton1.getInstance();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println();
        }
        {
            Singleton2 s1 = Singleton2.getInstance();
            Singleton2 s2 = Singleton2.getInstance();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println();
        }
        {
            Singleton3 s1 = Singleton3.getInstance();
            Singleton3 s2 = Singleton3.getInstance();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println();
        }        {
            Singleton4 s1 = Singleton4.getInstance();
            Singleton4 s2 = Singleton4.getInstance();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println();
        }
    }

}
