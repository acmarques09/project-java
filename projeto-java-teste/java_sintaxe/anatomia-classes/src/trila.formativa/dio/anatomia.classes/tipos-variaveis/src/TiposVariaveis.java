import javax.swing.plaf.synth.SynthSeparatorUI;

public class TiposVariaveis {
    public static void main(String[] args) {
            String meuNome = "Alessandro Marques";
            byte idade = 45;
            short ano = 2023;
            int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
            long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
            final float VALOR_PI = 3.14F; // precisar terminar com F no final para não ser considerada como double || COLOCAR FINAL E CAIXA ALTA PRA CONSATANTE
            double salario = 1275.33;
            double salarioMinimo = 2500; // declarar somente o numeral sem as casas pós ponto
            double unidade = 2.65;

            System.out.println(meuNome);
            System.out.println(unidade);
            System.out.println(salario);
            System.out.println(ano);
            System.out.println(idade);

            System.out.println(VALOR_PI);
}
}