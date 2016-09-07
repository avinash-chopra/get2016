$(document).ready(clk);
function clk(){
    $('#bt').click(show);

}
function show(){
    if($('#bt').html() == " Hide "){
       
        $('#sp').hide();
        $('#bt').html( " Show Text ");
    }
    else{
        $('#sp').show();
        $('#bt').html( " Hide ");
    }
}