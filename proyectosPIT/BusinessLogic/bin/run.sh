#!/bin/sh
# Si existe el directorio lo borramos

DIA=`date +"%d/%m/%Y"`
HORA=`date +"%H:%M"`
DIR_RESULT="results"
DIR_RESULT_COMPLETO="result_detail"
OP=2

if [ $OP -eq 1 ] ; then
    #
    if [ -e ./$DIR_RESULT ] ; then
        rm -r ./$DIR_RESULT;
    fi

    # Creamos el nuevo directorio
    mkdir $DIR_RESULT;

    # Ejecutamos el programa y redirigimos la salida a results
    mvn verify org.pitest:pitest-maven:mutationCoverage | grep -i 'mutations Killed' >> ./$DIR_RESULT/result.txt;

else
    if [ -e ./$DIR_RESULT_COMPLETO ] ; then
    rm -r ./$DIR_RESULT_COMPLETO;
    fi

    mkdir $DIR_RESULT_COMPLETO;


    mvn verify org.pitest:pitest-maven:mutationCoverage >> ./$DIR_RESULT_COMPLETO/result_$HORA.txt;
fi
