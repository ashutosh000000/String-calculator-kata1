public class Addition {
public static int add(String number){
String firstnumber,secondnumber;

    if(number!=""){
        if(number.contains(",")) {
            firstnumber = number.substring(0, number.indexOf(','));
            secondnumber = number.substring(number.indexOf(',')+1);
            if (secondnumber.equals("")) {
                return Integer.parseInt(firstnumber);
            } else {
                return Integer.parseInt(firstnumber)+Integer.parseInt(secondnumber);
            }
        }else{
            return Integer.parseInt(number);
        }
    }
    return 0;
}

    public static void main(String[] args) {
        System.out.println( add("12,3"));

    }
}
