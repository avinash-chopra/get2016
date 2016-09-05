function table(){
    if(document.getElementById('input').value != "") {

        var input = document.getElementById('input').value;
        var text = document.getElementById('show');
        if(isNaN(input)) {
            text.innerHTML = "Please Enter Correct Value";
        }
        else{
            var i;
            var result="";
            for(i=1;i<=10;i++){
                result = result + input*i;
                result = result + "<br />"
            }
            text.innerHTML = result;
        }
    }
    else{
         var text = document.getElementById('show');
        text.innerHTML = "Please Enter Correct Value";
    }
}