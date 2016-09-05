function getCombination(){
    var text1= document.getElementById('radioButton2')
    var text2= document.getElementById('radioButton3')
    var text3= document.getElementById('radioButton4')
    var text4= document.getElementById('radioButton5')
    var show = document.getElementById('result');
    var result = "These Numbers are Selected :";
    if(text1.checked){
        result += ' 2 ';
    }
    if(text2.checked){
        result +=  ' 3 ';
    }
    if(text3.checked){
        result += ' 4 ';
    }
    if(text4.checked){
        result += ' 5 ';
    }
    show.innerHTML = result;
    
    
}