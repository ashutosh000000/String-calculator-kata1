public class Addition {
public static int add(String number){
String firstnumber,secondnumber,firstnumbersecondpart;

    if(number!=""){
        if(number.contains(",")&&!number.contains("\n")) {
            firstnumber = number.substring(0, number.indexOf(','));
            secondnumber = number.substring(number.indexOf(',')+1);

            if (secondnumber.equals("")) {
                return Integer.parseInt(firstnumber);
            } else {
                return Integer.parseInt(firstnumber)+Integer.parseInt(secondnumber);
            }
        }
        if(number.contains("\n")&&number.contains(",")){
            firstnumber=number.substring(0, number.indexOf('\n'));
            firstnumbersecondpart=number.substring(number.indexOf('\n')+1,number.indexOf(','));
            secondnumber = number.substring(number.indexOf(',')+1);
            return Integer.parseInt(firstnumber)+Integer.parseInt(secondnumber)+Integer.parseInt(firstnumbersecondpart);
        }

            return Integer.parseInt(number);

    }
    return 0;
}

    public static void main(String[] args) {
        System.out.println( add("1\n2,3"));

    }
}
