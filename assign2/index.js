function printPyramidWithForLoop(){
	
	var finalPattern = [];
	var resultWithForLoop = document.getElementById("pyramidwithforloop");
	
	for(var i = 0; i <= 9 ; ++i){
		
		finalPattern.push(getSpacesWithForLoop(9,i)+getSymbolWithForLoop(i)+getSpacesWithForLoop(i)+"<br/>");
	}
	
	resultWithForLoop.innerHTML = finalPattern.join("");
}

function getSpacesWithForLoop(totalRows,rowNumber){
	
	var spaces = "";
	for(var i = totalRows-rowNumber-1;i >=0 ; --i){
		
		spaces += "&numsp;";
	}
	
	return spaces;
}

function getSymbolWithForLoop(rowNumber){
	
	var symbol = "";
	for(var i = 0 ; i < rowNumber; ++i){
		
		symbol += "* &nbsp;";
	}
	
	return symbol;
}


function printPyramidWithWhileLoop(){
	
	var finalPattern = [];
	var result = document.getElementById("pyramidwithwhileloop");
	var i = 0;
	
	while(i<= 9){
		
		finalPattern.push(getSpacesWithWhileLoop(9,i)+getSymbolWithWhileLoop(i)+getSpacesWithWhileLoop(i)+"<br/>");
		++i;
	}
	
	result.innerHTML = finalPattern.join("");
}

function getSpacesWithWhileLoop(totalRows,rowNumber){
	
	var spaces = "";
	var i = totalRows-rowNumber-1;
	while(i>=0){
		
		spaces += "&numsp;";
		--i;
	}
	
	return spaces;
}

function getSymbolWithWhileLoop(rowNumber){
	
	var symbol = "";
	var i = 0;
	while(i < rowNumber){
		
		symbol += "* &nbsp;";
		++i;
	}
	
	return symbol;
}


function printPyramidWithDoWhileLoop(){
	
	var finalPattern = [];
	var result = document.getElementById("pyramidwithdowhileloop");
	var i = 0;
	
	do{
		
		finalPattern.push(getSpacesWithWhileLoop(9,i)+getSymbolWithWhileLoop(i)+getSpacesWithWhileLoop(i)+"<br/>");
		++i;
	}while(i<=9);
	
	result.innerHTML = finalPattern.join("");
}

function getSpacesWithDoWhileLoop(totalRows,rowNumber){
	
	var spaces = "";
	var i = totalRows-rowNumber-1;
	do{
		
		spaces += "&numsp;";
		--i;
	}while(i>=0);
	
	return spaces;
}

function getSymbolWithDoWhileLoop(rowNumber){
	
	var symbol = "";
	var i = 0;
	do{
		
		symbol += "* &nbsp;";
		++i;
	}while(i<rowNumber);
	
	return symbol;
}



