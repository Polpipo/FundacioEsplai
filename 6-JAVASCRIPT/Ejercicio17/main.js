"use strict";
const resultado = $('#result');


function main(){
    clicked();
}


    let player=0;
    let robot=0;

function clicked(){
    let val = $('input[name="selection"]:checked').val();
    let numPlayer;

    switch(val){
    case '✂️':
        numPlayer = 0;
    break;
    case '🪨':
        numPlayer = 1;
    break;
    case '🧻':
        numPlayer = 2;
    break;

    }
    console.log('Player: ' + val);


    let randomNumMach = Math.floor(Math.random() * 3);
    let machine;
    if(randomNumMach == 0){
    machine = '✂️';
    }else if(randomNumMach == 1){
    machine = '🪨';
    }else{
    machine = '🧻';
    };
    console.log('Machine: ' + machine);

    if(numPlayer==randomNumMach){

    }else if(numPlayer=='0' && randomNumMach=='2' || numPlayer=='1' && randomNumMach=='0' || numPlayer=='2' && randomNumMach=='1'){
        
        
        player ++;
    }else{
        
        robot ++;
    }

    console.log('PLAYER: ' + player);
    console.log('MACHINE: ' + robot);

    if(player == 3 || robot == 3){
        player=0;
        robot=0;
        console.log('Se ha terminado la partida');
    }
};

