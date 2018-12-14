// var myArray = new Array("Test1", "Test2", "Test3");
// var myIndex = 1;
// var print = document.getElementById("textbox");

// print.innerHTML = myArray[0]; //Print first value of array right away.

// function myFunction() {
// 	if(myIndex < myArray.length)
// 	textbox.innerHTML = myArray[myIndex];
// 	myIndex = (myIndex + 1) 
// };

// var button1 = document.getElementById("bild1");
// button1.addEventListener("click", myFunction);

function clickFunction() {

	console.log("Hej");
	fetch("http://localhost:8080/ajax")
		.then(function (response) {
			return response.json();
		}).then(function (data) {
			console.log("This was recieved: ");
			console.log(data.fact);
			document.getElementById("textbox").innerText = data.fact;
		});
}