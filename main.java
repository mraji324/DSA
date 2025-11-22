class whatsapp{
    public static void aa(){
        System.out.println("chatting");
    }
    public static void bb(){
        System.out.println("calls");
        aa();
    }
    public static void cc(){
        System.out.println("statius");
        bb();
    }
    public static void dd(){
        System.out.println("meta ai");
        cc();
    }
}
class main{
    public static void main(String[] args){
        whatsapp wp=new whatsapp();
        wp.dd();
    }
}