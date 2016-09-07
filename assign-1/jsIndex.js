function change(){
    "use strict";
    var val = document.getElementById('bt');
    if (val.innerHTML == " Hide ") {
        var id = document.getElementById('sp');
        id.style.display = "none";
        val.innerHTML = " Show Text "
    }
      else {
        var id = document.getElementById('sp');
        id.style.display = "inline";
        val.innerHTML = " Hide "
    }
}