#!/bin/sh
# Si existe el directorio lo borramos

DIA=`date +"%d/%m/%Y"`
HORA=`date +"%H:%M"`
DIR_RESULT="results"
#
if [ -e ./$DIR_RESULT ] ; then
    rm -r ./$DIR_RESULT;
fi

# Creamos el nuevo directorio
mkdir $DIR_RESULT;

# Ejecutamos el programa y redirigimos la salida a results
mvn verify org.pitest:pitest-maven:mutationCoverage | grep -i 'mutations Killed' >> ./$DIR_RESULT/result.txt;
#mvn verify org.pitest:pitest-maven:mutationCoverage >> ./$DIR_RESULT/result_$HORA.txt;
