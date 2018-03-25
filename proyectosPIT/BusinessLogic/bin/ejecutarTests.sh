#!/bin/bash
PATHTEST='./src/test/java/es/tfg/ejemplos/BusinessLogicTest.java'
RESULTADOS='./resultsTests'

if [ -e ./$RESULTADOS ] ; then
rm -r ./$RESULTADOS;
fi

mkdir $RESULTADOS

for testFile in $(ls  ./tests)
do
    echo $testFile;
    rm $PATHTEST;
    cp ./tests/$testFile $PATHTEST;
    sh run.sh;
    cp ./results/result.txt $RESULTADOS/result_$testFile.txt;
done
echo "Terminado"
