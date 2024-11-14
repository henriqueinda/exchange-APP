public class PrintScreen {

    public String getScreen(String witchScreen) {
        String screen = "";

        if (witchScreen.equalsIgnoreCase("MENU 1")) {
            screen = """
                    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                    
                    BEM-VINDO AO EXCHANGEAPP!
                    
                    QUAL CÂMBIO VAMOS FAZER HOJE?
                    
                    1. DÓLAR >>> PESO ARGENTINO
                    2. PESO ARGENTINO >>> DÓLAR
                    3. DÓLAR >>> REAL BRASILEIRO
                    4. REAL BRASILEIRO >> DÓLAR
                    5. DÓLAR >>> PESO CHILENO
                    6. PESO CHILENO >>> DÓLAR
                    7. REAL BRASILEIRO >>> PESO CHILENO
                    8. PESO CHILENO >>> REAL BRASILEIRO
                    
                    9. SAIR
                    
                    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$""";
        } else if (witchScreen.equalsIgnoreCase("MENU 2")) {
            screen = """
                    QUAL CÂMBIO VAMOS FAZER?
                    
                    1. DÓLAR >>> PESO ARGENTINO
                    2. PESO ARGENTINO >>> DÓLAR
                    3. DÓLAR >>> REAL BRASILEIRO
                    4. REAL BRASILEIRO >> DÓLAR
                    5. DÓLAR >>> PESO CHILENO
                    6. PESO CHILENO >>> DÓLAR
                    7. REAL BRASILEIRO >>> PESO CHILENO
                    8. PESO CHILENO >>> REAL BRASILEIRO
                    
                    9. SAIR
                    """;
        } else if (witchScreen.equalsIgnoreCase("OPÇÃO")) {
            screen = """
                    DIGITE O NÚMERO DA OPÇÃO DESEJADA:""";
        } else if (witchScreen.equalsIgnoreCase("VALOR")) {
            screen = """
                    DIGITE QUAL VALOR VOCÊ QUER CONVERTER:""";
        } else if (witchScreen.equalsIgnoreCase("OPÇÃO INVÁLIDA")) {
            screen = """
       
                    OPÇÃO INVÁLIDA!
                    
                    TENTE NOVAMENTE...
                    """;
        } else if (witchScreen.equalsIgnoreCase("ADEUS")) {
            screen = """
                    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                    
                    OBRIGADO POR UTILIZAR O EXCHANGEAPP!
                    VOLTE SEMPRE QUE PRECISAR!
                    ATÉ O PRÓXIMO CÂMBIO...
                    
                    $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$""";
        }

        return screen;

    }

    public String getScreenConvert(String coinA,
                                   String coinB,
                                   double valueA,
                                   double valueB) {

        return """
                
                CONVERSÃO REALIZADA, COM SUCESSO!
                
                %.2f %s EQUIVALEM A %.2f %s.
                
                $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
                """.formatted(valueA, coinA, valueB, coinB);
    }

}
