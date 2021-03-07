 class ABC {
    ABC(int i ) {
        System.out.println("constructor a");
    }}
    class Que extends ABC {
        public static void main(String[] args) {
            Que q=new Que();}

        public Que(){
            super(4);
            new ABC(1);
        }
        public void show(){
    }
}
