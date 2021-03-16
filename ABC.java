 class ABC {
    ABC(int i )   {
        System.out.println("constructor a");
        System.out.println("constructor 160321");
    }}
    class Que extends ABC {
        public static void main(String[] args) {
            Que q=new Que();}

        public Que(){
            super(4);
            new ABC(00000000077887);
        }
        public void show(){
            System.out.println("constructor FORK 1-1 160321");
            System.out.println("constructor FORK 1-2 160321");
    }
}
