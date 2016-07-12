function validateEmail(email) 
{
    var re = /\S+@\S+\.\S+/;
    return re.test(email);
}

function validateForm(){
	var name = document.myForm.name.value;
	var email = document.myForm.email.value;
	var tel = document.myForm.phone.value;
	var mes = document.myForm.mess.value;

	if(name == "")
	{
		alert("Please provide your name");
		return false;
	}

	if(email == "")
	{
		alert("Please provide your email");
		return false;
	}
	if(!validateEmail(email))
	{
		alert("Invalid email!");
		return false;
	}

	if(tel.length < 10)
	{
		alert("Invalid phone number!");
		return false;
	}

	if(mes.length < 10)
	{
		alert("Message too short");
		return false;
	}
}