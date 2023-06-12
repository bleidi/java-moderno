
public class Example {

    public record Comunidade(String nome, Integer idade){}

    public static void main(String[] args) {
        var joinCommunity = new Comunidade("JoinCommunity", 10);

        System.out.println(joinCommunity.nome().toUpperCase());
        System.out.println(joinCommunity);


    }
}
