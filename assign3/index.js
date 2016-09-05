function getValue(){
    var text1 = document.getElementById('firstRadioOption');
    var text2 = document.getElementById('secondRadioOption');
    var id1 =  document.getElementById('firstDropdownField');
    var id2 = document.getElementById('secondDropdownField');
    if(text1.checked ){
        alert(id1.value);
    }
    if(text2.checked){
        alert(id2.value);
    }
}