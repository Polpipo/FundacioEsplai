"use strict";

//1. Define un array con las letras ‘a’, ‘b’, ‘c’, ‘d’ y ‘e’. Y, posteriormente, recorre cada uno de los elementos mediante a forEach
let array = ['a', 'b', 'c', 'd', 'e'];

array.forEach(item=>{
    console.log(item);
})

//2. Define una variable let numero = 5; que itere hasta que el valor sea 0.
let numero = 5;

do{
    console.log(numero);
    numero--;
}while(numero>=0)