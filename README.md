TP 15 Functional Programming/
├── bin/
└── src/
    ├── LambdaIntro.java              // Étapes 1 & 2 : Introduction et première interface fonctionnelle
    ├── InterfacesFonctionnelles.java // Étape 3 : Predicate, Consumer, Function, Supplier
    ├── InterfacesPrimitives.java     // Étape 4 : Spécialisations primitives (IntPredicate, etc.)
    ├── SyntaxeLambda.java            // Étape 5 : Variantes syntaxiques et inférence de type
    ├── CaptureLambda.java            // Étape 6 : Portée des variables et contrainte "effectively final"
    ├── ReferencesMethodes.java       // Étape 7 : 4 variantes de références de méthodes (::)
    ├── StreamBasics.java             // Étape 8 : filter, map, count, collect
    ├── StreamAvance.java             // Étape 9 : groupingBy, mapToInt, average, max
    ├── CompositionFonctions.java     // Étape 10 : andThen, compose, and, or, negate
    ├── ExceptionsLambda.java         // Étape 11 : Wrapper d'exceptions vérifiées (IOFunction)
    ├── ValidationFormulaire.java     // Étape 12 : Moteur de validation fluide basé sur Predicate<T>
    ├── TriFunctionDemo.java          // Étape 13 : Interface aritaire personnalisée TriFunction<A,B,C,R>
    ├── CompteurTODO.java             // Étape 14 : Analyse de système de fichiers avec Files.walk/lines
    ├── ComparateurCompose.java       // Étape 15 : Chaînage de Comparator (thenComparing, reverseOrder)
    ├── FactorielleStream.java        // Étape 16 : IntStream.rangeClosed et réduction fonctionnelle
    └── Memoizer.java                 // Étape 17 : Mémoïsation générique d'ordre supérieur

Étape 01 (LambdaIntro.java) : Fondements des expressions lambda, syntaxe élémentaire et exécution standard en console.

Étape 02 (LambdaIntro.java) : Principe SAM (Single Abstract Method), annotation @FunctionalInterface, transition d'une classe anonyme vers une lambda.

Étape 03 (InterfacesFonctionnelles.java) : Interfaces standard de java.util.function (Predicate<T>, Consumer<T>, Function<T, R>, Supplier<T>).

Étape 04 (InterfacesPrimitives.java) : Spécialisations primitives sans coût de boxing/unboxing (IntPredicate, IntConsumer, IntFunction, IntSupplier).

Étape 05 (SyntaxeLambda.java) : Syntaxe avancée (paramètre unique sans parenthèses, typage explicite, corps direct vs bloc d'instructions { return; }).

Étape 06 (CaptureLambda.java) : Fermeture (closure), contrainte des variables locales effectively final et résolution de référence du mot-clé this.

Étape 07 (ReferencesMethodes.java) : Syntaxe de l'opérateur :: (méthode statique, méthode d'instance sur objet lié, méthode d'instance sur type arbitraire, constructeurs d'objets et de tableaux).

Étape 08 (StreamBasics.java) : Opérations intermédiaires et terminales élémentaires (filter, map, count, Collectors.toList).

Étape 09 (StreamAvance.java) : Traitement avancé des collections (Collectors.groupingBy, passage aux streams primitifs via mapToInt, calculs de moyennes avec average, détection d'extrema avec max).

Étape 10 (CompositionFonctions.java) : Chaînage et algèbre de fonctions (Function.andThen, Function.compose, ainsi que Predicate.and, or, negate).

Étape 11 (ExceptionsLambda.java) : Gestion des exceptions vérifiées (checked exceptions) dans les lambdas via l'interface personnalisée IOFunction<T, R> et sa méthode wrapper unchecked().

Étape 12 (ValidationFormulaire.java) : Moteur de validation déclaratif et chaînable basé sur une liste de règles composées de Predicate<T> et de messages d'erreur.

Étape 13 (TriFunctionDemo.java) : Extension de l'arité fonctionnelle avec l'interface personnalisée TriFunction<A, B, C, R> et sa méthode par défaut andThen.

Étape 14 (CompteurTODO.java) : Manipulation d'E/S réactives et parcours récursif de fichiers à l'aide de Files.walk, Files.lines et Collectors.toMap.

Étape 15 (ComparateurCompose.java) : Chaînage de critères de comparaison multi-niveaux via Comparator.comparing, thenComparing, thenComparingInt et inversion d'ordre (reverseOrder).

Étape 16 (FactorielleStream.java) : Remplacement des boucles itératives impératives par des plages numériques IntStream.rangeClosed associées à une réduction reduce.

Étape 17 (Memoizer.java) : Fonction d'ordre supérieur pour la mémoïsation générique et mise en cache concurrente avec ConcurrentHashMap.computeIfAbsent.