function chart(){
    "use strict";
    var text1 = document.getElementById('show1');
    var text2 = document.getElementById('show2');
    var text3 = document.getElementById('show3');
    var text4 = document.getElementById('show4');
    var text5 = document.getElementById('show5');
    
    text1.innerHTML = "";
    text2.innerHTML = "";
    text3.innerHTML = "";
    text4.innerHTML = "";
    text5.innerHTML = "";
    // check if all fields are filled or not
    if( document.getElementById('input1').value != "" && document.getElementById('input2').value != "" && document.getElementById('input3').value != "" && document.getElementById('input4').value != ""){
        var input1 = Number(document.getElementById('input1').value);
        var input2 = Number(document.getElementById('input2').value);
        var input3 = Number(document.getElementById('input3').value);
        var input4 = Number(document.getElementById('input4').value);
        var flag = 1;
        // if input is not an integer then show field number
        if(isNaN(input1) || input1%1 != 0 || input1<0) {
            text1.innerHTML = "Please, Fill First Field Correctly ";
            flag = 2;
        }
        if(isNaN(input2) || input2%1 != 0 || input2<0) {
            text2.innerHTML = "Please, Fill Second Field Correctly";
            flag = 2;
        }
        if(isNaN(input3) || input3%1 != 0 || input3 <0 ) {
            text3.innerHTML = "Please, Fill Third Field Correctly ";
            flag = 2;
        }
        if(isNaN(input4) || input4%1 != 0 || input4<0) {
            text4.innerHTML = "Please, Fill Fourth Field Correctly";
            flag = 2;
        }
            
        // if all field is correct then run this block of code
        if( flag != 2 ) {
            var result = "";
            var max = Math.max(input1,input2,input3,input4);
            for(var i=max;i > 0;i--){
                if(input1 < max ){
                    result = result + "&numsp; &nbsp;";
                }else{
                    result = result + "* &nbsp;" ;
                    input1--;
                }
                
                if(input2 < max ){
                    result = result + "&numsp; &nbsp;";
                }else{
                    result = result + "* &nbsp;" ;
                    input2--;
                }
                
                if(input3 < max ){
                    result = result + "&numsp; &nbsp;";
                }else{
                    result = result + "* &nbsp;" ;
                    input3--;
                }
                
                if(input4 < max ){
                    result = result + "&numsp; &nbsp;";
                }else{
                    result = result + "* &nbsp;" ;
                    input4--;
                }
                max--;
                result = result + "<br />" ;
            }
            result += "A" + " " + "B"+ " "+ "C" +" "+"D";
            text5.innerHTML = result;
        }
    }
    // show field number if any one is blank
    else{
        if(document.getElementById('input1').value == "" ){
            text1.innerHTML = "Please, Fill First Field ";
        }
        if(document.getElementById('input2').value == "" ){
            text2.innerHTML = "Please, Fill Second Field ";
        }
        if(document.getElementById('input3').value == "" ){
            text3.innerHTML = "Please, Fill Third Field ";
        }
        if(document.getElementById('input4').value == "" ){
            text4.innerHTML = "Please, Fill Fourth Field ";
        }
    }
}