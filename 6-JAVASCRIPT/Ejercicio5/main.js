"use strict";

/*
 1. A partir de la siguiente instrucción que genera un número aleatorio console.log(Math.round(Math.random())); que genera un número 
 aleatorio 0 o 1. Haz una función con return, invocala y muestra por consola cara si el valor es 1 y cruz si el valor es 0.
*/

const CaraCruz = () => {
    let resultado = Math.round(Math.random());
    let result;

    if(resultado == 1){
        result='CARA';
    }else{
        result='CRUZ';
    }

    return result;
}

console.log('Ha tocado ' + CaraCruz());