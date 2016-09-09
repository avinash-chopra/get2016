$(document).ready(init);

function init(){
    updateHello();
}

function updateHello(){
    $('label.hello').html('Hello World!');
}