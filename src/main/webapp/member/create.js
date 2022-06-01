window.onload=function(){
	const MemCreate = document.forms.MemCreate;
	let domain = "@gmail.com";
	console.log(domain);
	
	EMAIL_DOMAIN.addEventListener("input", async(e)=>{
			console.log(e.target.value);
			domain = e.target.value;
	});
	
	
	MemCreate.EMAIL.addEventListener("input", async(e)=>{
		let email = e.target.value+domain;
		console.log(email);
		const res = await fetch("./emailChecker.do?EMAIL="+email);
		const json = await res.json();
		
		if(json.email_check){
			email_check.style.color = "red";
			email_check.innerText = "사용 불가 이메일";
		}
		else{
			email_check.style.color = "green";
			email_check.innerText = "사용 가능 이메일";
		}
	});
	
	MemCreate.EMAIL.addEventListener("focus", async(e)=>{
		let email = e.target.value+domain;
		console.log(email);
		const res = await fetch("./emailChecker.do?EMAIL="+email);
		const json = await res.json();
		
		if(json.email_check){
			email_check.style.color = "red";
			email_check.innerText = "사용 불가 이메일";
		}
		else{
			email_check.style.color = "green";
			email_check.innerText = "사용 가능 이메일";
		}
	});
	
	MemCreate.ID.addEventListener("input", async(e)=>{
		const res = await fetch("./idChecker.do?ID="+e.target.value);
		const json = await res.json();
		
		
		if(e.target.value.length > 3){
			if(json.id_check){
				id_check.style.color = "red";
				id_check.innerText = "사용 불가 ID";
			}
			else{
				id_check.style.color = "green";
				id_check.innerText = "사용 가능 ID";
			}
		}
		else{
			id_check.style.color = "red";
			id_check.innerText = "사용 불가 ID";
		}
	});
	
	MemCreate.ID.addEventListener("focus", async(e)=>{
		const res = await fetch("./idChecker.do?ID="+e.target.value);
		const json = await res.json();
		
		
		if(e.target.value.length > 3){
			if(json.id_check){
				id_check.style.color = "red";
				id_check.innerText = "사용 불가 ID";
			}
			else{
				id_check.style.color = "green";
				id_check.innerText = "사용 가능 ID";
			}
		}
		else{
			id_check.style.color = "red";
			id_check.innerText = "사용 불가 ID";
		}
	});
};


