$(document).ready(tableFunction);
function tableFunction(){
    $('tr:even').css('background-color','green');
    $('tr:odd').css('background-color','orange');
}