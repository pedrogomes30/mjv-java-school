
public class operadoresLogicos {
    public static void main(String[] args) {
        int exemplos = 0;

        System.out.println(" -- ATRIBUIÇÃO -- ");
        String concatenacao = "?";
        System.out.println("1+1+1+'1'           :"+(concatenacao = 1+1+1+"1"));       //31
        System.out.println("1+'1'+1+1           :"+(concatenacao = 1+"1"+1+1));       //1111
        System.out.println("'1'+(1+1+1)         :"+(concatenacao = "1"+(1+1+1)));     //13
        System.out.println("OBS: java só aceita aspas duplas, no exemplo a cima é para que ocnsiga exibi-los sem precisar reconcatenar");     

        System.out.println(" -- UNÁRIOS -- ");
        int unarios = 1;
        System.out.println("original            :"+unarios);  //1
        System.out.println("negativo (-)        :"+ (-unarios));  //-1
        System.out.println("incrementa e exibe  :"+(++unarios));  //incrementa e exibe
        System.out.println("exibe e incrementa  :"+(unarios++));  //exibe e incrementa
        System.out.println("decrementa e exibe  :"+(--unarios));  //decrementa e exibe
        System.out.println("exibe e decrementa  :"+(unarios--));  //exibe e decrementa
        Boolean booleanos = false;
        System.out.println("um booleano  :"+booleanos);  //exibe e decrementa
        System.out.println("negando o booleano"+ (!booleanos));  //exibe e decrementa
        
        System.out.println(" -- TERNÁRIOS --"); 
        String ternario = booleanos ? "verdadeiro" : "falso";
        System.out.println("booleanos ? verdadeiro : falso :"+(ternario));

        System.out.println(" -- RELACIONAIS --"); 
        System.out.println(" igualdade  1 == 1      :"+ (1 == 1));
        System.out.println(" diferente  1 != 1      : "+ (1 != 1));
        System.out.println(" maior do que  1 > 1    : "+ (1 > 1));
        System.out.println(" maior igual do que  1 >= 1 : "+ (1 >= 1));
        System.out.println(" menor do que  1 < 1    :"+ (1 < 1));
        System.out.println(" menor do que  1 <= 1   : "+ (1 <= 1));

        System.out.println(" -- LOGICOS --"); 
        System.out.println(" && -> ambos precisam ser verdadeiros "); 
        System.out.println(" || -> pelomenos um precisa ser verdadeiro ");   

    }
}