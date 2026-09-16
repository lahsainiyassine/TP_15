import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface IOFunction<T, R> {
    R apply(T t) throws IOException;

    // Méthode utilitaire (wrapper) encapsulant l'IOException dans une RuntimeException
    static <T, R> Function<T, R> unchecked(IOFunction<T, R> f) {
        return t -> {
            try {
                return f.apply(t);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}

public class ExceptionsLambda {
    public static void main(String[] args) {
        try (Stream<Path> flux = Files.list(Paths.get("."))) {
            List<String> fichiers = flux
                    .map(p -> {
                        try {
                            return Files.size(p) + " octets - " + p.getFileName();
                        } catch (IOException e) {
                            return "Erreur: " + p.getFileName();
                        }
                    })
                    .collect(Collectors.toList());
            System.out.println("Fichiers dans le répertoire courant :");
            fichiers.forEach(f -> System.out.println("  " + f));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        try (Stream<Path> flux = Files.list(Paths.get("."))) {
            List<Long> tailles = flux
                    .map(IOFunction.unchecked(Files::size))
                    .collect(Collectors.toList());
            System.out.println("Tailles brutes récupérées : " + tailles);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}