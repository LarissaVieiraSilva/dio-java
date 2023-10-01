public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int nota = 3;
        
        //if-else
        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        //if elseif else
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
