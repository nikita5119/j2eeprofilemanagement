


function validateForm(){
	$("input[required]").each(function() {
		if($(this).val()===''){
			alert("All fields must be filled out");
		}
	})
}