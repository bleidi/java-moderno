public class Example {

    public record NomeCompleto(String primeiroNome, String ultimoNome){}

    public record Comunidade(NomeCompleto nome, Integer idade){}

    public static void main(String[] args) {
        NomeCompleto nome = null; // new  NomeCompleto(null, "JoinCommunity");
        var joinCommunity = new Comunidade(nome, 10);

        System.out.println(joinCommunity.nome().primeiroNome().toUpperCase());
        System.out.println(joinCommunity);


    }
    
}
