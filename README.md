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
<img width="896" height="876" alt="tp15 etape 1" src="https://github.com/user-attachments/assets/9afd1a12-b7e1-4efa-985c-997c1248e707" />




Étape 02 (LambdaIntro.java) : Principe SAM (Single Abstract Method), annotation @FunctionalInterface, transition d'une classe anonyme vers une lambda.

<img width="997" height="896" alt="tp15 etape 2" src="https://github.com/user-attachments/assets/454c23b7-cda9-4fda-906a-1564040d21ed" />



Étape 03 (InterfacesFonctionnelles.java) : Interfaces standard de java.util.function (Predicate<T>, Consumer<T>, Function<T, R>, Supplier<T>).

<img width="901" height="916" alt="tp15 etape 3" src="https://github.com/user-attachments/assets/221b45b0-bce6-42ce-944e-7f925c1a6928" />


Étape 04 (InterfacesPrimitives.java) : Spécialisations primitives sans coût de boxing/unboxing (IntPredicate, IntConsumer, IntFunction, IntSupplier).

<img width="807" height="922" alt="tp15 etape 4" src="https://github.com/user-attachments/assets/34616a21-8401-4270-88d0-dcc4d5ee3901" />


Étape 05 (SyntaxeLambda.java) : Syntaxe avancée (paramètre unique sans parenthèses, typage explicite, corps direct vs bloc d'instructions { return; }).
<img width="977" height="922" alt="tp15 etape 5" src="https://github.com/user-attachments/assets/aee6f068-ff0a-4d7c-a0b1-5dc2d48a156d" />


Étape 06 (CaptureLambda.java) : Fermeture (closure), contrainte des variables locales effectively final et résolution de référence du mot-clé this.

<img width="992" height="897" alt="tp15 etape 6" src="https://github.com/user-attachments/assets/c9ba57a0-2ddb-4e69-bc17-55e754cd306d" />


Étape 07 (ReferencesMethodes.java) : Syntaxe de l'opérateur :: (méthode statique, méthode d'instance sur objet lié, méthode d'instance sur type arbitraire, constructeurs d'objets et de tableaux).

<img width="932" height="920" alt="tp15 etape 7" src="https://github.com/user-attachments/assets/45164adb-fb8f-4938-a308-7e5bd0fd55fe" />


Étape 08 (StreamBasics.java) : Opérations intermédiaires et terminales élémentaires (filter, map, count, Collectors.toList).
<img width="987" height="902" alt="tp15 etape 8" src="https://github.com/user-attachments/assets/20b289ef-6f70-4448-a0b1-16e9f70f0051" />


Étape 09 (StreamAvance.java) : Traitement avancé des collections (Collectors.groupingBy, passage aux streams primitifs via mapToInt, calculs de moyennes avec average, détection d'extrema avec max).



https://github.com/user-attachments/assets/bfb4ffc3-208c-4ed5-b070-e8c69a034b20


Étape 10 (CompositionFonctions.java) : Chaînage et algèbre de fonctions (Function.andThen, Function.compose, ainsi que Predicate.and, or, negate).


<img width="1162" height="926" alt="tp15 etape 10" src="https://github.com/user-attachments/assets/050adacd-ad3c-41b1-99f0-fcf11c77850d" />

Étape 11 (ExceptionsLambda.java) : Gestion des exceptions vérifiées (checked exceptions) dans les lambdas via l'interface personnalisée IOFunction<T, R> et sa méthode wrapper unchecked().


<img width="1182" height="930" alt="tp15 etape 11" src="https://github.com/user-attachments/assets/e6e0b41b-ef4f-4db7-a1df-d9a8e111e39e" />

Étape 12 (ValidationFormulaire.java) : Moteur de validation déclaratif et chaînable basé sur une liste de règles composées de Predicate<T> et de messages d'erreur.




https://github.com/user-attachments/assets/a785bfdb-4abb-4eaf-8dd9-096cc53c3337


Étape 13 (TriFunctionDemo.java) : Extension de l'arité fonctionnelle avec l'interface personnalisée TriFunction<A, B, C, R> et sa méthode par défaut andThen.


<img width="1055" height="912" alt="tp15 etape 13" src="https://github.com/user-attachments/assets/384d1163-ba9f-4570-8a06-7bc82d19f24a" />

Étape 14 (CompteurTODO.java) : Manipulation d'E/S réactives et parcours récursif de fichiers à l'aide de Files.walk, Files.lines et Collectors.toMap.



https://github.com/user-attachments/assets/36c5f3b3-5636-44ba-b43f-727e061ac708



Étape 15 (ComparateurCompose.java) : Chaînage de critères de comparaison multi-niveaux via Comparator.comparing, thenComparing, thenComparingInt et inversion d'ordre (reverseOrder).



https://github.com/user-attachments/assets/a1703922-be21-4e68-aa93-64f1adc07c22


Étape 16 (FactorielleStream.java) : Remplacement des boucles itératives impératives par des plages numériques IntStream.rangeClosed associées à une réduction reduce.



https://github.com/user-attachments/assets/3ea476d8-c6b4-4b64-922b-f672f44a2dbd


Étape 17 (Memoizer.java) : Fonction d'ordre supérieur pour la mémoïsation générique et mise en cache concurrente avec ConcurrentHashMap.computeIfAbsent.



https://github.com/user-attachments/assets/c1c427e3-e676-4691-9347-3e18e635438f

