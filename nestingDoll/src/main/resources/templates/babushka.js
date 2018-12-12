


var myArray = new Array("Test", "Test2", "Test3");
var myIndex = 1;
var print = document.getElementById("textbox");

print.innerHTML = myArray[0]; //Print first value of array right away.

function myFunction() {
	textbox.innerHTML = myArray[myIndex];
	myIndex = (myIndex + 1) % (myArray.length);
};