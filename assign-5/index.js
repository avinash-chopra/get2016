$(document).ready(getAllSelectors);

function getAllSelectors(){
	
	getSiblings();
	getChildren();
	getClosest();
	getParent();
	getDescendents();
	getNext();
	getPrevious();
}
function getSiblings(){
	
	$('ul.ul-1 li').siblings().css('background-color','#6371CF');
}

function getChildren(){
	
	$('div#myDiv').children().css('background-color','#C5CB5E');
}

function getClosest(){
	
	$('ul.ul-2 li.item-1').closest('ul').css('background-color','#E888E3');
}

function getParent(){
	
	$('ul.ul-3 li.item-A').parent().css('background-color','#94E888');
}

function getDescendents(){
	
	$('div#myDiv2').find('div#myDiv3').css('background-color','#B7EAE7');
}

function getNext(){
	
	$('li.third-item').next().css('background-color','#EAD7B7');
}

function getPrevious(){
	
	$('li.fourth-item').prev().css('background-color','#DAC789');
}