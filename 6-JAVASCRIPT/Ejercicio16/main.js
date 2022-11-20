"use strict";

const rojo = $('#rojo');
const botonRojo = $('#botonRojo');

botonRojo.click(() => { 
    rojo.toggleClass('red');
});



const botonAzul = document.getElementById("botonAzul");

botonAzul.onclick = function(){
    var azul = document.getElementById("azul");
    azul.classList.toggle('blue');
    console.log('hola')
};