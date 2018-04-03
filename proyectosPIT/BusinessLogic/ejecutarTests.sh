#!/bin/bash
PATHTEST='./src/test/java/es/tfg/ejemplos/BusinessLogicTest.java'
RESULTADOS='./resultsTests'

if [ -e ./$RESULTADOS ] ; then
rm -r ./$RESULTADOS;
fi

mkdir $RESULTADOS

for testFile in $(ls  ./testsPoms)
do
    rm $PATHTEST;
    cp ./tests/$testFile pom.xml;
    sh run.sh >> resultados.txt;
done
echo "Terminado"
