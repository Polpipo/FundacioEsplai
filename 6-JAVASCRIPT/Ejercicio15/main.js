"use strict";

const arr = ['🍺', '🦎', '🦁', '😂', '🙏', '❤️', '🤩', '🎉', '😅', '🥶', '🤯', '😛', '😚', '😒', '🧑🏽‍🦲', '🧍🏽‍♂️', '🐊', '🐆', '🦘', '🦒', '☘️', '🦥', '🥪', '🍓'];
const result = [];
let resultado = $('#result');
let i = 0;

$('#push').click(() => { 
    arr.map((element, index)=>{
        if(index==i){
            result.push(element);
        }    
    });
    i++;
    resultado.html(result);
});

$('#unshift').click(() => { 
    arr.map((element, index)=>{
        if(index==i){
            result.unshift(element);
        }    
    });
    i++;
    resultado.html(result);
});

$('#insert').click(() => { 
    arr.map((element, index)=>{
        let insertNum = $('#numIns').val()-1;
        if(index==i){
            result.splice(insertNum, 0, element);
        }    
    });
    i++;
    resultado.html(result);
});

$('#pop').click(() => { 
    result.pop();
    resultado.html(result);
});

$('#shift').click(() => { 
    result.shift();
    resultado.html(result);
});

$('#remove').click(() => { 
    let removeNum = $('#numRem').val()-1;
    result.splice(removeNum, 1);
    resultado.html(result);
});