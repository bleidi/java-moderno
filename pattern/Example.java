public class Example {

    sealed interface Animal permits Cachorro, Gato {
    }

    public record Cachorro (int idade) implements Animal { }

    static final class Gato implements Animal { }

    public record Coordenada (double latitude, double longitude) {}

    public record Localizacao (String nome, Coordenada coordenada) {}

    public static void main(String[] args) {
        var marcoZeroGoiania = new Coordenada(-16.6669996,-49.2624723);

        var o = new Localizacao("JoinCommunity", new Coordenada(-20.1083045,-56.5757782));
        

        if (o instanceof Localizacao (var n, Coordenada(var lat, var lon))) {
            
            double ac = java.lang.Math.abs(lon - marcoZeroGoiania.longitude());
            double cb = java.lang.Math.abs(lat - marcoZeroGoiania.latitude());
        
            System.out.println("Distancia: " + java.lang.Math.hypot(ac, cb));
        }

        Animal pet = new Cachorro(5);
        String result = switch (pet) {
            case Cachorro c when c.idade() > 3 -> "🐶" ;
            case Cachorro c2 -> "🐕";
            case Gato g -> "🐱";
        };

        System.out.println(result);


    }
}

