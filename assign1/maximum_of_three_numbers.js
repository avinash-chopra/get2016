function fnMaxOfNumbers() {
    "use strict";
    var text1 = document.getElementById('show1');
    var text2 = document.getElementById('show2');
    var text3 = document.getElementById('show3');
    var text4 = document.getElementById('show4');
    text1.innerHTML = "" ;
    text2.innerHTML = "" ;
    text3.innerHTML = "" ;
    var input1, input2, input3;
    if(document.getElementById('input1').value !="" && document.getElementById('input2').value !="" && document.getElementById('input3').value !=""){
         input1 = Number(document.getElementById('input1').value);
         input2 = Number(document.getElementById('input2').value);
         input3 = Number(document.getElementById('input3').value);


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
       if(document.getElementById('input1').value ==""){
           text1.innerHTML = "Please, Enter First text field"
       }
        
       if(document.getElementById('input2').value ==""){
           text2.innerHTML = "Please, Enter Second text field"
       }
        
       if(document.getElementById('input3').value ==""){
           text3.innerHTML = "Please, Enter Third text field"
       }
    }
    
}