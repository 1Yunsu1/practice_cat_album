
	let table = document.getElementById("list");
	let body = document.getElementById("body");
	let clone = document.getElementById("clone");
	
	for(let i = 0; i < 10; i++){
		let new_thing = clone.cloneNode(true);
		body.append(new_thing);
		console.log(new_thing);		
	}
	
