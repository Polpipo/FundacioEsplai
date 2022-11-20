"use strict";

//1. Crea una función en la que pasándole un string como parámetro se substituyan las letras A por las O.
const replace = (text)=>{
    console.log(text.replaceAll('a', 'o'));
};

replace('Palabras con la a');


//2. Crea una función que compruebe si un string pasado como parámetro empieza por 'aca' y llama dos veces a la función una con academia y otra con escuela.
const aca = (text)=>{
    console.log(text.startsWith('aca'));
};

aca('academia');
aca('escuela');


//3. Crea una función que pasándole un Hola nos salude 3 veces utilizando métodos de Strings.
const hola = (text)=>{
    console.log(text.repeat(3));
}

hola('hola ');