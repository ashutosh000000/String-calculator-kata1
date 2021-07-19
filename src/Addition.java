public class Addition {
public static int add(String number){
String firstnumber,secondnumber,firstnumbersecondpart;

    if(number!=""){
        if(number.contains(",")&&!number.contains("\n")) {
            firstnumber = number.substring(0, number.indexOf(','));
            secondnumber = number.substring(number.indexOf(',')+1);

            if (secondnumber.equals("")) {
                if(Integer.parseInt(firstnumber)<0){
                    System.out.println("negatives not allowed ");
                    findError(firstnumber);
                    return 0;
                }
                return Integer.parseInt(firstnumber);
            } else {
                if(Integer.parseInt(firstnumber)<0||Integer.parseInt(secondnumber)<0){
                    System.out.println("negatives not allowed ");
                    findError(firstnumber);
                    findError(secondnumber);
                return 0;
                }
                return Integer.parseInt(firstnumber)+Integer.parseInt(secondnumber);
            }
        }
        if(number.contains("\n")&&number.contains(",")&&!number.contains("/")){
            firstnumber=number.substring(0, number.indexOf('\n'));
            firstnumbersecondpart=number.substring(number.indexOf('\n')+1,number.indexOf(','));
            secondnumber = number.substring(number.indexOf(',')+1);

            if(Integer.parseInt(firstnumbersecondpart)<0||Integer.parseInt(secondnumber)<0||Integer.parseInt(firstnumber)<0){
                System.out.println("negatives not allowed ");
                findError(firstnumbersecondpart);
                findError(secondnumber);
                findError(firstnumber);
                return 0;
            }
            return Integer.parseInt(firstnumber)+Integer.parseInt(secondnumber)+Integer.parseInt(firstnumbersecondpart);
        }

        if(number.contains("\n")&&number.contains("/")){
            number=number.replace("//","");
            firstnumber=number.substring(0, number.indexOf("\n"));
            firstnumbersecondpart=number.substring(number.indexOf("\n"));
            secondnumber= firstnumbersecondpart.substring(firstnumbersecondpart.indexOf(firstnumber)+1);
            firstnumbersecondpart=firstnumbersecondpart.substring(1,firstnumbersecondpart.indexOf(firstnumber));

            if(Integer.parseInt(firstnumbersecondpart)<0||Integer.parseInt(secondnumber)<0){
                System.out.println("negatives not allowed ");
                findError(firstnumbersecondpart);
                findError(secondnumber);
                return 0;
            }
            return Integer.parseInt(firstnumbersecondpart)+Integer.parseInt(secondnumber);
        }

        if(Integer.parseInt(number)<0){
            System.out.println("negatives not allowed");
            findError(number);
            return 0;
        }
        return Integer.parseInt(number);

    }
    return 0;
}

public static void findError(String number){
if(Integer.parseInt(number)<0){
    System.out.print(number+" ");
}
}

    public static void main(String[] args) {
        System.out.println( add("//;\n2;3"));

    }
}
