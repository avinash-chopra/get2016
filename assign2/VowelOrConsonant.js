function fnVowelOrConsonant() {
    "use strict";
    var input1;
     input1 = document.getElementById('input1').value;
    input1 = input1.toLowerCase();
     var text1 = document.getElementById('show1');
    if(input1.length > 1 || input1.length <= 0) {
        text1.innerHTML = "Input is Wrong " ;
    }
    else if ( input1.charCodeAt() < 97 || input1.charCodeAt()>122 ){
         text1.innerHTML = "Input is Wrong  " ;
    }
    else {
        if(input1 === 'a' || input1 === 'e' || input1 ==='i' || input1 === 'o' || input1 === 'u') {
            text1.innerHTML = "Input is Vowel" ;
        } 
        else {
            text1.innerHTML = "Input is Consonant" ;
        }
    }
    
    
}