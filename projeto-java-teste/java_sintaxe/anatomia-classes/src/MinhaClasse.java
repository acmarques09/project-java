public class MinhaClasse {
    // Tudo que vai ser escrito na classe
    public static void main(String[] args) {
        // método --> tudo será executado aqui
        
        // System.out.println("\nAula de anatomia das classes 1 - DIO\n");
        //saída da informação no terminal

        String primeiroNome = "Alessandro";
        String segundoNome = "Marques";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
