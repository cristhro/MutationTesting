# MutationTesting

## Para ejecutar desde la line de comandos
```
mvn verify org.pitest:pitest-maven:mutationCoverage
```

## Para ejecutar el proyecto en Eclipse
En Run configuration, configurar el proyecto para maven.
1. Working directory seleccionar la carpeta del proyecto /MutationTesting/mutationTesting.
2. En Goals poner el siguiente comando: `verify org.pitest:pitest-maven:mutationCoverage`.

## Para ejecutar el proyecto en IntelliJ IDEA
En Run configuration, configurar el proyecto para maven. 
1. Working directory seleccionar la carpeta del proyecto /MutationTesting/mutationTesting.
2. En Command line poner el siguiente comando: `verify org.pitest:pitest-maven:mutationCoverage`.
