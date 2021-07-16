public class Addition {
public static int add(String number){


    if(number!=""){
        number=number.substring(0,number.indexOf(',')) ;
        return Integer.parseInt(number);
    }
    return 0;
}

    public static void main(String[] args) {
        add("12+");

    }
}
