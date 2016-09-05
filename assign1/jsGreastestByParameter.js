function fnMaxOfNumbers( para1, para2, para3) {
    "use strict";
    
    var text1 = document.getElementById('show1');
    var text2 = document.getElementById('show2');
    var text3 = document.getElementById('show3');
    var text4 = document.getElementById('show4');
    text1.innerHTML = "";
    text2.innerHTML = "";
    text3.innerHTML = "";
    if(para1!="" && para2 != "" && para3 != ""){
        
        var input1,input2,input3;
        input1 = Number(para1);
        input2 = Number(para2);
        input3 = Number(para3);

       
        if(isNaN(Number(input1)) || isNaN(Number(input2)) || isNaN(Number(input3))) {
            if (isNaN(input1)) {
            text1.innerHTML = "First Input is not correct ";
        }else{
             text1.innerHTML = "First Number is " +input1;
        }
        if (isNaN(input2)) {
            text2.innerHTML = "Second Input is not correct ";
        }else {
             text2.innerHTML = "Second Number is " +input2;
        }
          if (isNaN(input3)) {
            text3.innerHTML = "Third Input is not correct ";
        }else {
             text3.innerHTML = "Third Number is " +input3;
        }
        }

        else {
            text1.innerHTML = "First Number is " +input1;
            text2.innerHTML = "Second Number is " +input2;
            text3.innerHTML = "Third Number is " +input3;
            if(input1>input2 && input1 > input3){
                text4.innerHTML = " <br /> First Number is Maximum "+input1;
            }
            else if(input2>input1 && input2>input3) {
                text4.innerHTML = " <br /> Second Number is Maximum "+input2;
            }
            else {
                text4.innerHTML = "<br />Third Number is Maximum "+input3;
            }
        }    
    }
    else{
        if(para1 == ""){
            text1.innerHTML = "Please ,Enter First Number";
        }
        
        if(para2 == ""){
            text2.innerHTML = "Please ,Enter Second Number";
        }
        
        if(para3 == ""){
            text3.innerHTML = "Please ,Enter Third Number";
        }
    }
   
    
}