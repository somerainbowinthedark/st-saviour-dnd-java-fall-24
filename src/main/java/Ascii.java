
public class Ascii {
    
    public static void drawD20(int value) {
        if(value > 9) {
            String d20 = String.format("            ,:::,\r\n" + //
                      "       ,,,:;  :  ;:,,, \r\n" + //
                      "   ,,,:       :       :,,, \r\n" + //
                      ",,;...........:...........;,,\r\n" + //
                      "; ;          ;';          ; ;\r\n" + //
                      ";  ;        ;   ;        ;  ;\r\n" + //
                      ";   ;      ;     ;      ;   ;\r\n" + //
                      ";    ;    ;       ;    ;    ;\r\n" + //
                      ";     ;  ;   %s    ;  ;     ;\r\n" + //
                      ";      ;:...........:;      ;\r\n" + //
                      ";     , ;           ; ,     ;\r\n" + //
                      ";   ,'   ;         ;   ',   ;\r\n" + //
                      "'';'      ;       ;      ';''\r\n" + //
                      "   ''';    ;     ;    ;'''         \r\n" + //
                      "       ''':;;   ;;:'''\r\n" + //
                      "            ':::'", value);
                      
            System.out.println(d20);
        } else {
            String d20 = String.format("            ,:::,\r\n" + //
                      "       ,,,:;  :  ;:,,, \r\n" + //
                      "   ,,,:       :       :,,, \r\n" + //
                      ",,;...........:...........;,,\r\n" + //
                      "; ;          ;';          ; ;\r\n" + //
                      ";  ;        ;   ;        ;  ;\r\n" + //
                      ";   ;      ;     ;      ;   ;\r\n" + //
                      ";    ;    ;       ;    ;    ;\r\n" + //
                      ";     ;  ;    %s    ;  ;     ;\r\n" + //
                      ";      ;:...........:;      ;\r\n" + //
                      ";     , ;           ; ,     ;\r\n" + //
                      ";   ,'   ;         ;   ',   ;\r\n" + //
                      "'';'      ;       ;      ';''\r\n" + //
                      "   ''';    ;     ;    ;'''         \r\n" + //
                      "       ''':;;   ;;:'''\r\n" + //
                      "            ':::'", value);

        System.out.println(d20);
        }   
    }

    public static void drawD6(int value) {
        String d6 = String.format(" ::::::::::::::\r\n" + //
                        " ::          ::  \r\n" + //
                        " ::          ::\r\n" + //
                        " ::    %s     ::\r\n" + //
                        " ::          ::\r\n" + //
                        " ::          ::                \r\n" + //
                        " :::::::::::::: ", value);
        System.out.println(d6);
    }

    public static void drawD4(int value) {
        String d4 = String.format("          ;;\r\n" + //
                        "        ,;  ;,\r\n" + //
                        "       ,;    ;,\r\n" + //
                        "      ,;      ;,\r\n" + //
                        "     ,;        ;,\r\n" + //
                        "    ,;          ;, \r\n" + //
                        "   ,;     %s      ;,\r\n" + //
                        "  ,;              ;,\r\n" + //
                        " ,;                ;, \r\n" + //
                        ",;                  ;,\r\n" + //
                        "::::::::::::::::::::::", value);
        System.out.println(d4);
    }
}
