function ten() {
    var input;
    input = prompt("Enter the Number");
    
    while(isNaN(input) || input == "") {
        input = prompt("Enter the Number");
    }
    
    var text = document.getElementById('show1');
    text.innerHTML = Number(input)+10;
}