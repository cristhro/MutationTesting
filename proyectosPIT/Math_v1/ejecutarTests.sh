#!/bin/bash
PATHTEST='./src/test/java/Test'
RESULTADOS='./resultsTests'

if [ -e ./$RESULTADOS ] ; then
rm -r ./$RESULTADOS;
fi

mkdir $RESULTADOS

for testFile in $(ls  ./tests)
do
  echo $testFile
  rm -r $PATHTEST
  mkdir $PATHTEST
  cp -r ./tests/$testFile $PATHTEST
  rm -r ./target
  sh run.sh
  cp ./results/result.txt $RESULTADOS/result_$testFile.txt
done
echo "Terminado"
