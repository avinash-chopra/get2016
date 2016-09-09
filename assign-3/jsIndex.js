$('document').ready(init);

function init(){
    
    $('#start').click(rightMove);
    $('#stop').click(stop);
    $('#back').click(back);
    $('#left').click(left);
    $('#right').click(right);
    $('#up').click(up);
    $('#down').click(down);
}

function rightMove(){
    $('div#box').animate({
        left:"+=80%",
    },5000);
}
function stop(){
    $('div#box').stop();
}
function back(){
     $('div#box').animate({
        left:"-=80%",
    },5000);
}

function left(){
    $('div#box').animate({
        left:"-=50",
    },1000);
}

function right(){
    $('div#box').animate({
        left:"+=50",
    },1000);
}

function up(){
    $('div#box').animate({
        top:"-=50",
    },1000);
}
function down(){
    $('div#box').animate({
        top:"+=50",
    },1000);
}



