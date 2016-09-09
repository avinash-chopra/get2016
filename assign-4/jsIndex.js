$(document).ready(init);

function init(){
    $('input#name').keyup(nameChange);
    $('input#age').keyup(ageChange);
    $('textarea#address').keyup(addressChange);
}

function nameChange(){
    if($('input#name').val() !== ""){
            var val="Name:"
            val += $('input#name').val();
            $('#show div#show_name').html(val);    
     var box = $('input#name');
        backgroundColor(box);
        }
        else{
            $('#show div#show_name').html("");   
        }
}
function backgroundColor(box){
    var originalColor = 'white';
    box.css('background-color','#6371CF');
    setTimeout(function(){
        box.css('background-color',originalColor);
    },200);
}

function ageChange(){
    if($('input#age').val() !== ""){
            var val="Age:"
            val += $('input#age').val();
            $('#show div#show_age').html(val);    
     var box = $('input#age');
        backgroundColor(box);
        }
        else{
            $('#show div#show_age').html("");   
        }
}

function addressChange(){
    if($('textarea#address').val() !== ""){
            var val="Address:"
            val += $('textarea#address').val();
            $('#show div#show_address').html(val);    
        var box = $('textarea#address');
        backgroundColor(box);
        }
        else{
            $('#show div#show_address').html("");   
        }
}