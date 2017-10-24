# MutationTesting

Para ejecutar desde la line de comandos:
mvn verify org.pitest:pitest-maven:mutationCoverage

Para ejecutar el proyecto en eclipse
1. En Run configuration,configurar el proyecto para maven 
  1.1. Working directory seleccionar la carpeta del proyecto /MutationTesting/mutationTesting
  1.2 En Goals poner el siguiente comando: verify org.pitest:pitest-maven:mutationCoverage

Para ejecutar el proyecto en IntelliJ IDEA
2. En Run configuration, configurar el proyecto para maven  
  2.1 Working directory seleccionar la carpeta del proyecto /MutationTesting/mutationTesting
  2.2 En Command line poner el siguiente comando: verify org.pitest:pitest-maven:mutationCoverage
