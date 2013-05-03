function login(){
	var user = $("#user");
	var password=$("#password").val();
	alert(user+password);
	$.ajax({
		sync: true,
		data:  {"user":password,"password":password},
		url:   'mvc/usuarios/login',
		type:  'post',
		beforeSend: function () {
			$("#resultado").html("Procesando, espere por favor...");
		},
		success:  function (response) {																	
			alert(response);			
		}			
	});			
} 
