$(document).ready(allFunctions);
function allFunctions(){
   $('span.message').css('background-color','red');
   $('div.box:first').css('background-color','green') ;
    $('button').css('background-color','orange');
    $('img[alt="hello"]').css('background-color','orange');
    $('#myDiv input[type="text"]').css('background-color','orange');
    $('input[type="text"][name^=txt]').css('background-color','pink');
    $('p:not(.box)').css('background-color','pink');
     $('div[class="box"],div[class="error"]').css('background-color','pink');
    $('div[class="box error"]').css('background-color','red');
    $('div#myDiv span.info').css('background-color','yellow');
}