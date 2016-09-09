$(document).ready(init);

function init(){
    var data
    $.ajax({
    url:'json.json',
    dataType:"text",
    success:function(temp){
       data = $.parseJSON(temp);
    }
}
)
    $('select').change(function(){
        
        var emp = $('select').val();
        if(emp !== "null"){
             var str='Name:'+data[emp].name+'<br />'+
            'Email:'+data[emp].email+'<br />'+
        'Date of Birth:'+data[emp].dob+'<br />'+
            'address:'+data[emp].Address;
        $('#show').html(str);
        }
        else{
            $('#show').html("");
        }
       
    }
    );
    
}