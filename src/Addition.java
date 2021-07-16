public class Addition {
public static int add(String number){

    if(number!=""){
        return Integer.parseInt(number);
    }
    return 0;
}

    public static void main(String[] args) {
        add("12");

    }
}
