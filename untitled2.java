public class untitled2 {
    public untitled2() {
        System.out.println("a");
    }}
    class B extends untitled2{
        public B() {
            System.out.println("b");
        }}
        class Cf extends B{
            public Cf() {
                System.out.println("C");
            }

            public static void main(String[] args) {
       untitled2 c=new B();
    }

}
